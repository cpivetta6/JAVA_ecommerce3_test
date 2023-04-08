package com.example.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Item;
import com.example.demo.services.ItemService;

@RestController
@RequestMapping(value = "/item")
public class ItemResource {

	
	@Autowired
	private ItemService service;
	
	public ResponseEntity<Item> findById(@PathVariable Integer id){
		
		Item item = service.find(id);
		
		return ResponseEntity.ok().body(item);
	}
	
}
