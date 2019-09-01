package com.chaodian.twohourboot.rest;

import com.chaodian.twohourboot.config.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRest {
    @Autowired
    LimitConfig limitConfig;

    @GetMapping("/getConfig")
    public Object getConfig() {
        return limitConfig;
    }
}
