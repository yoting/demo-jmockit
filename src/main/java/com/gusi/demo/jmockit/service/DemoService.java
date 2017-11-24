package com.gusi.demo.jmockit.service;

import com.gusi.demo.jmockit.dao.DemoDao;
import com.gusi.demo.jmockit.utils.DemoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoService {

    @Autowired
    private DemoDao demoDao;

    public String doMethod0() {
        String result = demoDao.doInDao("service");
        return result;
    }

    public String doMethod2() {
        String result = doPrivate();
        return result;
    }

    private String doPrivate() {
        return "private result";
    }

    public String doMethod3() {
        String result = DemoUtil.doInUtil();
        return result;
    }
}
