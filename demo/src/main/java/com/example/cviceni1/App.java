package com.example.cviceni1;

import com.example.cviceni1.services.Greeting;
import com.example.cviceni1.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App extends Greeting {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		MyController myController = context.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}
}
