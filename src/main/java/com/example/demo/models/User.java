package com.example.demo.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User_table")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private	String name;
	
	@ElementCollection
	@CollectionTable(name = "phone")
	private List<String> phone = new ArrayList<>();
	
	public User () {
		
	}

	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<String> getPhone() {
		return phone;
	}


	public void setPhone(List<String> phone) {
		this.phone = phone;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, name, phone);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	
	
	
	
	
	
}
