package com.example.cviceni1.controllers;

import com.example.cviceni1.services.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final Greeting greeting;

    @Autowired
    public MyController() {
        this.greeting = new Greeting();
    }

    public String sayHello() {
        return greeting.sayGreeting();
    }
}
