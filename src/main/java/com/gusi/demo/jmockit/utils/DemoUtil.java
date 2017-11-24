package com.gusi.demo.jmockit.utils;

import com.gusi.demo.jmockit.others.DemoBeanOther;

public class DemoUtil {

    //        private final static DemoBean DEMO_BEAN = SpringFactoryUtil.getBean(DemoBean.class);
    private final static DemoBeanOther DEMO_BEAN = (DemoBeanOther) SpringFactoryUtil.getBean("demoBeanOtherddd");

    public static String doInUtil() {
        return "util result";
    }

    public static String getDemoBean() {
        SpringFactoryUtil.getBean("demoBeanOther");
        return DEMO_BEAN.doInBena();
    }
}
