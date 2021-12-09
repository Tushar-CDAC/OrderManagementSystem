package com.app.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.core.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {
	
	List<Order> findAll();
	
	Order findById(int id);
	
	Order findByStatus(boolean status);
}
