package com.javaex.ex01;

public class Person {
	protected String name;
	protected String hp;
	
	//생성자
	public Person(String name, String hp) {
		super();
		this.name = name;
		this.hp = hp;
		System.out.println("	Instance Person Constructor ");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public void showInfo() {
		System.out.printf("이름: %s, 연락처: %s%n", name, hp);
	}
	
}
