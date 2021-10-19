package com.simplilearn.webservice.entity;

public class Account {

	int id;
	String name;
	
	public Account(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Account() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
