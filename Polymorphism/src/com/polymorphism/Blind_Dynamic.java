package com.polymorphism;

public class Blind_Dynamic {
protected String val;
void display(String str) {
	val="Derived Class Function".concat(str);
	System.out.println(val);
}
}
class SubClass extends Blind_Dynamic{
	void display(String str) {
		if(val==null) {
			str="Derived Class Function".concat(str);
			System.out.println(str);
		}
	}
}
class MainClass{
	public static void main(String[] args) {
		SubClass obj=new SubClass();
		obj.display("called");
	}
	}

