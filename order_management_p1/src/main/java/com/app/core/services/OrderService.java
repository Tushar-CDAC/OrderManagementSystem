package com.app.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.core.entity.Order;
import com.app.core.repositories.OrderRepo;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepo orderRepo;
	
	public Order createOrder(Order order) {
		
		return orderRepo.save(order);
	}
	
	public List<Order> getAllOrder() {
		
		return orderRepo.findAll();
	}
	
	public Order getOrderById(int id) {
		return orderRepo.findById(id);
	}
	
	public Order updateOrder(Order order) {
		return orderRepo.save(order);
	}
	
	public Order updateOrderById(int id) {
		//return orderRepo.findById(id);
		Order order = orderRepo.findById(id);
		return orderRepo.save(order);
	}
	
	public Order updateOrderByStatus(boolean status) {
		Order order = orderRepo.findByStatus(status);
		return orderRepo.save(order);
	}
}
