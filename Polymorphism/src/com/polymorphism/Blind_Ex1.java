package com.polymorphism;

public class Blind_Ex1 {
	String text = "Blind_Ex1's";

	void display() {
		System.out.println(text + "function called");
	}

}
class SubClass1 extends Blind_Ex1{
	void display() {
		super.display();
		text="SubClass1's";
		System.out.println(text+"function called");
	}
}
class SubClass2 extends SubClass1{
	void display() {
		super.display();
		text="SubClass2";
		System.out.println(text+"function called");
	}
}
class MainClasss{
	public static void main(String[] args) {
		SubClass obj=new SubClass();
		obj.display("r");
	}
	
}