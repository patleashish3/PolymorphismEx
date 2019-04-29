package com.polymorphism;

public class BaseClass2 {
	public static void main(String[] args) {
		// method calling from sub class object
		DerivedClass der = new DerivedClass();
		der.method();
		//method calling from super class object
		BaseClass2 base = new BaseClass2();
		base.method();

		BaseClass2 base1 = new DerivedClass();
		base1.method();

	}
	public void method() // Base class method
	{
		System.out.println(" I am the method of base class");
	}
}

class DerivedClass extends BaseClass2 {
	public void method() // Base class method
	{
		System.out.println("I am in the method of Derived class");
	}
}

