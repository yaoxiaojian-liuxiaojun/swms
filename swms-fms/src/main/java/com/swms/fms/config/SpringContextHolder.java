package com.swms.fms.config;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContextHolder implements ApplicationContextAware {
    private static final Logger log = LoggerFactory.getLogger(SpringContextHolder.class);
    private static ApplicationContext mContext;
    public static String[] arguments = null;

    public SpringContextHolder() {
    }

    public static ApplicationContext getContext() {
        return mContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        mContext = applicationContext;
    }
}