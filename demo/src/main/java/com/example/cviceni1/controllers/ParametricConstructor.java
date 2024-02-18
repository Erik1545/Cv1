package com.example.cviceni1.controllers;

import com.example.cviceni1.services.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ParametricConstructor {
    private final Greeting greeting;

    @Autowired
    public ParametricConstructor(Greeting greeting) {
        this.greeting = greeting;
    }

    public String sayHello() {
        return greeting.sayGreeting();
    }
}
