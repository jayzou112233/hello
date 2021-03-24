package com.jayzou.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jayzou
 * @create 2021-03-23 21:11
 */
@RestController

public class Hello {
    @RequestMapping("/hello")
    public String helloworld(){
        return "hello buddy!!";
    }
}
