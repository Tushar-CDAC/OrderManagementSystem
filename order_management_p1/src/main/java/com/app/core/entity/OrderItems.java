package com.app.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "orderItems")
public class OrderItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int order_line_id;
	
	@Column
	private String item_description;
	
	@Column
	private int quantity;
	
	@OneToOne(mappedBy = "orderItems")
	@JsonBackReference
	private Order order;

	public int getOrder_line_id() {
		return order_line_id;
	}

	public void setOrder_line_id(int order_line_id) {
		this.order_line_id = order_line_id;
	}

	public String getItem_description() {
		return item_description;
	}

	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	
}
