package com.hui.deploydemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "Hi asa, this is dev branch controller!";
    }
}
