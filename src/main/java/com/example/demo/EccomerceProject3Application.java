package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.Item;
import com.example.demo.models.User;
import com.example.demo.repositories.ItemRepository;
import com.example.demo.repositories.UserRepository;

@SpringBootApplication
public class EccomerceProject3Application implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(EccomerceProject3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User user1 = new User(null, "Caio", "caio@gmail.com");
		user1.getPhone().add("3456468");
		
		userRepository.save(user1);
		
		Item item1 = new Item(null, "TV", 500.0);
		Item item2 = new Item(null, "Tablet", 800.0);
		Item item3 = new Item(null, "Phone", 300.0);
		itemRepository.saveAll(Arrays.asList(item1, item2, item3));
		
		
	}

}
