package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class SpringDbExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDbExampleApplication.class, args);
	}
	 
	  @Bean
	  public BCryptPasswordEncoder passwordEncoder() {
	      return new BCryptPasswordEncoder(5);
	  }
}
