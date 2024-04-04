package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User[] users = new User[3];
		// User 클래스와 하위 클래스를 모두담을 수 있는 배열
		
		User u01 = new Customer("jws","j1234","정우성",1000);
		User u02 = new Customer("yjs","y2345","이효리",2000);
		User u03 = new Employee("master","m7788","운영자",5_000_000); // 운영자
		
		// 세 명의 사용자 배열에 등록
		// 참조 자료형의 배열은 참조 객체의 주소가 할당(객체는 항상 메모리 주소를 갖음)
		// 객체가 배열에 직접 들어가는 것은 아님
		users[0] = u01;
		users[1] = u02;
		users[2] = u03;
		
		for (int i = 0; i < users.length; i++) {
			users[i].showInfo();
		}
		//다운캐스팅
//		User 클래스의 하위 클래스인 Employee 클래스에는 getSalary() 메서드가 존재합니다.
//		그러나 User 클래스에는 getSalary() 메서드가 존재하지 않습니다.
//		따라서 users 배열에 저장된 객체가 실제로 Employee 객체인 경우에만 getSalary() 메서드에 접근할 수 있습니다.
//		다운캐스팅을 통해 User 타입의 변수인 u03를 Employee 타입으로 형변환하여 getSalary() 메서드에 접근합니다.
		int salary = ((Employee)u03).getSalary();
		System.out.println("운영자의 월급은 " + salary + "원 입니다.");
	}

}
