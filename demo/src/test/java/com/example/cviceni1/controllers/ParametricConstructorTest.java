package com.example.cviceni1.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ParametricConstructorTest {

    @Autowired
    ParametricConstructor controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}