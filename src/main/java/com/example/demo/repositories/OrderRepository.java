package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.User;

public interface OrderRepository extends JpaRepository<User, Integer> {

}
