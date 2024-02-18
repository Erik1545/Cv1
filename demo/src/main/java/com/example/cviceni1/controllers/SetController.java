package com.example.cviceni1.controllers;
import com.example.cviceni1.services.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetController {
    private Greeting greeting;

    @Autowired
    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }

    public String sayHello() {
        return greeting.sayGreeting();
    }
}