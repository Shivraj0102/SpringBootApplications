package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private int addharNum;
	private String name;
	@Autowired
	@Qualifier("adres")
	private Address add;

	public Person() {
		this.addharNum = 1234567890;
		this.name = "Shiva";
	}

	public Person(int addharNum, String name, Address add) {
		super();
		this.addharNum = addharNum;
		this.name = name;
		this.add = add;
	}

	public int getAddharNum() {
		return addharNum;
	}

	public void setAddharNum(int addharNum) {
		this.addharNum = addharNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public void show() {
		System.out.println("In Person Show.." + this.toString());
	}

	@Override
	public String toString() {
		return "Person [addharNum=" + addharNum + ", name=" + name + ", add=" + add + "]";
	}
}
