package com.beans;

import org.springframework.stereotype.Component;

@Component
public class ComposedBean {
    private SingletonBean singletonBean;
    private PrototypeBean prototypeBean;

    public ComposedBean(SingletonBean singletonBean, PrototypeBean prototypeBean) {
        this.singletonBean = singletonBean;
        this.prototypeBean = prototypeBean;
    }

    public int getProtoX() {
        return prototypeBean.x;
    }

    public int getSingleX() {
        return singletonBean.x;
    }

}