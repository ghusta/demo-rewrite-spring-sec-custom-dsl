package com.example.demorewritespringseccustomdsl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

public class MyCustomDsl extends AbstractHttpConfigurer<MyCustomDsl, HttpSecurity> {
    private static final Logger log = LoggerFactory.getLogger(MyCustomDsl.class);

    private boolean flag;

    @Override
    public void init(HttpSecurity http) throws Exception {
        // do nothing
        log.info("Entering MyCustomDsl.init");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        // do nothing
        log.info("Entering MyCustomDsl.configure");
    }

    public MyCustomDsl flag(boolean value) {
        this.flag = value;
        return this;
    }

    public boolean isFlag() {
        return flag;
    }

    public static MyCustomDsl customDsl() {
        return new MyCustomDsl();
    }

}