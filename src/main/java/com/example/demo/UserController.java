package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	

@GetMapping("/user")
public String getUser() {
	return "welcome user";
}

@GetMapping("/admin")
public String getAdmin() {
	System.out.println("hello admin");
	return "welcome Admin";

}

@GetMapping("/welcome")
public String getBoth() {
	return "hi user/admin";
}
}
