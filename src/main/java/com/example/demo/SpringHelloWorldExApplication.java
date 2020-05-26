package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SpringHelloWorldExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHelloWorldExApplication.class, args);
	}
	
	@GetMapping("/getData")
	public @ResponseBody String getData(){
		
		return "HELLO WORLD...............";
	}

}
