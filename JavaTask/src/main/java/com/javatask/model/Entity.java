package com.javatask.model;


public class Entity {

	private int number;
	private String order;
	
	
	public Entity(int number, String order) {
		super();
		this.number = number;
		this.order = order;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getOrder() {
		return order;
	}


	public void setOrder(String order) {
		this.order = order;
	}


	public Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
