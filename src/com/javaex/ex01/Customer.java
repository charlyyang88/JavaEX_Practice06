package com.javaex.ex01;

public class Customer extends Person {
	private int cNo;
	private int point;

//	public Customer(int cNo, int point) {
//		super("", "");
//		this.cNo = cNo;
//		this.point = point;
//	}

	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp); // 부모 생성자 호출
		this.cNo = cNo;
		this.point = point;
	}

	// 객체 초기화
//	public int Person(int cNo, int point) {
//		this.cNo = cNo;
//		this.point = point;
//	}

	// getter/setter
	public int getCNo() {
		return cNo;
	}

	public void setCNo(int cNo) {
		this.cNo = cNo;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}


	@Override	// 현재 메서드가 Override 인지 확인
	public void showInfo() {
	System.out.printf("#이름:%s, #핸드폰:%s, #고객번호:%d, #포인트점수:%d", name, hp, cNo, point);
	}

}
