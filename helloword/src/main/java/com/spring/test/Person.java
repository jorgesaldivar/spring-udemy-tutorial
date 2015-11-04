package com.spring.test;

public class Person {

	private int id;
	private String name;
	
	public Person() {
		//super();
		//this.id = id;
	//	this.name = name;
	}
	
	public Person(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}


	


	public void speak() {
		System.out.println("Hello I'm a person");
	}
	
	
}
