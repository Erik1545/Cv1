package com.example.cviceni1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

@SpringBootTest
class InstanceControllerTest {
    @Autowired
    InstanceController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}