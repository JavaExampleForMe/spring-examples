package com.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Lazy
@Component
public class SingletonBean {
    public int x = (int) (Math.random()*100);

    @PostConstruct
    public void init(){
        System.out.println("Init Lazy Singleton x = " + x);
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Singleton is going to shutdown");
    }
}
