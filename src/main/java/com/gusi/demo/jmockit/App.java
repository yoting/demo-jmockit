package com.gusi.demo.jmockit;

import com.gusi.demo.jmockit.utils.DemoUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");


        String s = DemoUtil.getDemoBean();
        System.out.println(s);
    }
}
