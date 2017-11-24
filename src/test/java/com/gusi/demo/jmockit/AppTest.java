package com.gusi.demo.jmockit;

import com.gusi.demo.jmockit.utils.DemoUtil;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    @Test
    public void testMain() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");


        String s = DemoUtil.getDemoBean();
        System.out.println(s);

        try {
            TimeUnit.SECONDS.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}