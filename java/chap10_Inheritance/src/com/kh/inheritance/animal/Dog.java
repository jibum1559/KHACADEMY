package com.kh.inheritance.animal;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);//상위 클래스(Animal)의 멤버에 접근하는 데 사용
	}
	
	public void speak() {
		System.out.println(getName() + " 뭥뭥!!(밥죠!!) ");
	}
	
}