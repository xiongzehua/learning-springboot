package com.xiongzehua.learning.springboot.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiongzehua on 2018/7/8.
 */
@Controller
public class Hello {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello SpringBoot!";
    }
}
