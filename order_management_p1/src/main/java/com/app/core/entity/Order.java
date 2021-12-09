package com.app.core.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;
//import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int order_id;
	
	@Column
	private int location_id;
	
	@Column
	private boolean status;
	
	@CreationTimestamp
	@Column(name = "created_date",updatable = false)
	//@DateTimeFormat(pattern = "yyyy.MM.dd HH:mm:ss a")
	Timestamp created_date;
	
	@UpdateTimestamp
	//@Column(name = "update_date")
	//@DateTimeFormat(pattern = "yyyy.MM.dd HH:mm:ss a")
	Timestamp updated_date;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="line_id")
	@JsonManagedReference
	private OrderItems orderItems;
	
	

	public Order(int order_id, int location_id, boolean status, Timestamp created_date, Timestamp updated_date,
			OrderItems orderItems) {
		super();
		this.order_id = order_id;
		this.location_id = location_id;
		this.status = status;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.orderItems = orderItems;
	}
	
	

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Timestamp getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}

	public Timestamp getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Timestamp updated_date) {
		this.updated_date = updated_date;
	}

	public OrderItems getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(OrderItems orderItems) {
		this.orderItems = orderItems;
	}
	
	
	
	
}
