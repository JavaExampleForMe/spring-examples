package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com")
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Test.class);

        String[] beanDefinitionNames = ((AnnotationConfigApplicationContext) ctx).getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));


        PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
        System.out.println("prototypeBean1.x=" + prototypeBean1.x);
        PrototypeBean prototypeBean2 = ctx.getBean("prototypeBean",PrototypeBean.class);
        System.out.println("prototypeBean2.x=" + prototypeBean2.x);
        PrototypeBean prototypeBean6 = ctx.getBean("proto6",PrototypeBean.class);
        System.out.println("prototypeBean6.x=" + prototypeBean6.x);
        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
        System.out.println("singletonBean1.x=" + singletonBean1.x);
        SingletonBean singletonBean2 = ctx.getBean("singletonBean",SingletonBean.class);
        System.out.println("singletonBean2.x=" + singletonBean2.x);
        ComposedBean composedBean = ctx.getBean(ComposedBean.class);
        System.out.println("composedBean.getProtoX()=" + composedBean.getProtoX());
        System.out.println("composedBean.getSingleX()=" + composedBean.getSingleX());
        ((AnnotationConfigApplicationContext) ctx).close();
    }
}
