package com.example.demo.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Item;
import com.example.demo.repositories.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository repository;
	
	public Item find(Integer id) {
		Optional<Item> obj = repository.findById(id);
		
		return obj.orElseThrow(()->new ObjectNotFoundException("Object not found: " + id + ", type: " +Item.class.getName(), obj));
	}
	
}
