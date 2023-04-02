package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;

@SpringBootApplication
public class EccomerceProject3Application implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(EccomerceProject3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User user1 = new User(null, "Caio");
		user1.getPhone().add("3456468");
		
		userRepository.save(user1);
		
		
	}

}
