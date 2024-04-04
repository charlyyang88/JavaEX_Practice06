package com.javaex.ex04;

public class Customer extends User {
	// 필드
	private int point;
//	*생성자
	public Customer() {
		
	}
	public Customer(String id, String password, String name, int point) {
		super(id, password, name); // 부모 먼저 초기화
		this.point = point;
	}
	
//	*getter / setter
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public void showInfo() {
		System.out.println("#id:" + id + ", #pw:" + password + ",#name:" + name + "#point:" + point);
	}

}
