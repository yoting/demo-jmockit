package com.gusi.demo.jmockit.others;

import org.springframework.stereotype.Component;

@Component("demoBean")
public class DemoBean {
    public String doInBena() {
        return "bean result";
    }
}
