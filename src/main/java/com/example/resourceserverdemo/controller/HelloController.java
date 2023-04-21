package com.example.resourceserverdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //curl -H "Authorization: bearer 28a23373-515e-4443-b0b0-2b5d02645d85" http://localhost:9090/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }

}
