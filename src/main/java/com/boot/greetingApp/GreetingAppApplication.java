package com.boot.greetingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class GreetingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingAppApplication.class, args);
	}
    @GetMapping("/welcome")
    public String welcome() {
    	return "welcome to spring boot greeting app";
    }
    @GetMapping("/greeting")
    public String greeting() {
    	return "greetings from spring boot greeting app";
    }
}
