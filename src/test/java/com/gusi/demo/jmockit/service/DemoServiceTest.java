package com.gusi.demo.jmockit.service;

import com.gusi.demo.jmockit.dao.DemoDao;
import com.gusi.demo.jmockit.others.DemoBean;
import com.gusi.demo.jmockit.others.DemoBeanOther;
import com.gusi.demo.jmockit.utils.DemoUtil;
import com.gusi.demo.jmockit.utils.SpringFactoryUtil;
import mockit.Capturing;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Mock;
import mockit.Mocked;
import mockit.Tested;
import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;

import javax.swing.*;

@RunWith(JMockit.class)
public class DemoServiceTest {
    @Tested
    DemoService demoService;

    @Injectable
    DemoDao demoDao;

//    @Capturing
//    ApplicationContext applicationContext;

    @Mocked
    SpringFactoryUtil springFactoryUtil;
//    @Mocked
//    DemoUtil demoUtil;

    @Test
    public void doMethod0() throws Exception {
        new Expectations() {
            {
                demoDao.doInDao(anyString);
                result = "Mock result";
            }
        };

        String result = demoService.doMethod0();
        System.out.println(result);
    }

    @Test
    public void doMethod2() throws Exception {
//        System.out.println(applicationContext);
    }

    /**
     * test Static
     *
     * @throws Exception
     */
    @Test
    public void doMethod3() throws Exception {
//        System.out.println(applicationContext);

        new Expectations() {
            {
                SpringFactoryUtil.getBean(anyString);
                result = new DemoBeanOther();
                result = new DemoBeanOther();
                times=2;
            }

            @Mocked
            DemoUtil demoUtil;

            {
                demoUtil.doInUtil();
                result = "4444444 Mock result";
//                result = "5555555 Mock result";
            }

        };

        Object obj = SpringFactoryUtil.getBean("demoBeanOtherddd");
        System.out.println(obj);
        String result = demoService.doMethod3();
        System.out.println(result);
    }

}