package com.app.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.core.entity.Order;
import com.app.core.services.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/add")
	public ResponseEntity<Order> createOrder(@RequestBody Order order){
		return new ResponseEntity<>(orderService.createOrder(order), HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Order>> getAllOrder(){
		return new ResponseEntity<>(orderService.getAllOrder(), HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Order> getOrderById(@PathVariable int id){
		return new ResponseEntity<Order>(orderService.getOrderById(id), HttpStatus.OK);
	}
	
	//Update Order (Take status and update for an orderId)
	@PutMapping("/update")
	public ResponseEntity<Order> updateOrder(@RequestBody Order order){
		return new ResponseEntity<>(orderService.updateOrder(order), HttpStatus.OK); 
	}
	
//	@PutMapping("/update/{id}")
//	public ResponseEntity<Order> updateOrderById(@PathVariable int id){
//	
//		
//	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Order> updateOrderById(@PathVariable int id){
		//List<Order> order = orderService.getAllOrder();
		//Order order2 = orderService.getOrderById(id);
		//Order order = orderRepo.findById(id);
		//return new ResponseEntity<Order>(orderService.updateOrderById(id),HttpStatus.OK);
		return new ResponseEntity<Order>(orderService.updateOrderById(id),HttpStatus.OK);
	}
	
//	@PutMapping("/update/{status}")
//	public ResponseEntity<Order> updateOrderByStatus(@PathVariable boolean status){
//		return new ResponseEntity<Order>(orderService.updateOrderByStatus(status),HttpStatus.OK);
//	}
}
