package com.springboot.learning.springboot.restapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloWoldController {

    // Get request
    // http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }
}
