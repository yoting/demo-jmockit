package com.gusi.demo.jmockit.dao;

import org.springframework.stereotype.Component;

@Component
public class DemoDaoImpl implements DemoDao {
    public String doInDao(String param) {
        return "dao result-" + param;
    }
}
