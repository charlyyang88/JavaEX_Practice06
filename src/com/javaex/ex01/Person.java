package com.javaex.ex01;

public class Person {
	protected String name;
	protected String hp;
	
	//생성자
	public Person(String name, String hp) {
		super(); //  Person 클래스의 생성자에서 super();를 사용하는 것은 부모 클래스인 Object 클래스의 기본 생성자를 호출하는 것입니다. 하지만 주석 처리된 상태에서도 동일하게 동작합니다. 왜냐하면 super();는 명시적으로 호출하지 않아도 자동으로 추가되기 때문입니다.
		this.name = name;
		this.hp = hp;
		System.out.println("	Instance Person Constructor ");
	}
	
	public String getName() {
		return this.name; // this.name 으로 보다 명확하게 할 수 있음
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
