package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
@Scope("prototype")
@Primary
public class PrototypeBean {
    public int x = (int) (Math.random()*100);

    public PrototypeBean(int x) {
        this.x = x;
    }
    public PrototypeBean() {
    }
    @PostConstruct
    public void init(){
        System.out.println("Init  Prototype x =" + x);
    }
}
