package com.javaex.ex04;

public class Employee extends User {
	private int salary;

//	*생성자
	public Employee() {

	}

	public Employee(String id, String password, String name, int salary ) {
		// 부모 먼저 초기화
		super(id, password, name);
		this.salary = salary;
	}

//	*getter / setter
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void showInfo() {
		System.out.println("#id:" + super.getId() + ", #pw:" + super.getPassword() + ",#name:" + super.getName() + ",#salary:" + salary);
	}


	
}
