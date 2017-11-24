package com.gusi.demo.jmockit.others;

import org.springframework.stereotype.Component;

@Component("demoBeanOther")
public class DemoBeanOther {
    public String doInBena() {
        return "other bean result";
    }
}
