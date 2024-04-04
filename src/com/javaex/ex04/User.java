package com.javaex.ex04;

public class User {
	// 필드
	protected String id;
	protected String password;
	protected String name;
	
	// 기본 생성자
	public User() {
		
	}
	
	// 전체 필드 생성자
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
//	*getter / setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
//		System.out.printf("#id:%s , #pw:%s, #name:%s%n", id, password, name);
		System.out.println("#id:" + id + ", #pw:" + password + ",#name:" + name);
	}
	
}
