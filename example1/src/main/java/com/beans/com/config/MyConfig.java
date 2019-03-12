package com.beans.com.config;

import com.beans.PrototypeBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public PrototypeBean proto6 (){
        return new PrototypeBean(6);
    }
}
