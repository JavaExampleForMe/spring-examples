package com.beans.com.intercept;

import com.beans.PrototypeBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class EvenInit implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof PrototypeBean && !bean.equals("proto6")){
            PrototypeBean pb = (PrototypeBean) bean;
            if (pb.x % 2 == 0) {
                System.out.println("Not updating the x " + pb.x );
            } else {
                System.out.println("Updating the x " + pb.x );
                pb.x++;
            }

        }
        return bean;
    }

}
