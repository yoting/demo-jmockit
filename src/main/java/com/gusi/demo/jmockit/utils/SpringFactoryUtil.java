package com.gusi.demo.jmockit.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringFactoryUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext = null;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static <T> T getBean(Class<T> type) {
        T t = applicationContext.getBean(type);
        return t;
    }

    public static <T> T getBean(String name) {
        T t = (T) applicationContext.getBean(name);
        return t;
    }

//    public static Object getBean(String name) {
//        return applicationContext.getBean(name);
//    }
}
