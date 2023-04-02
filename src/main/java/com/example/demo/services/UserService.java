package com.example.demo.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User find(Integer id) {
		Optional<User> obj = repository.findById(id);
		
		return obj.orElseThrow(()-> new ObjectNotFoundException("Object not found! id = "+id+ ", type:" + User.class.getName(), obj));
	}
	
	
}
