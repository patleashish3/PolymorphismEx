package com.polymorphism;

public class Overload {
	void demo(int a) {
		System.out.println("a:"+a);
	}
	void demo(int a, int b) {
		System.out.println("a and b"+a+","+b);
	}
	double demo (double d) {
		System.out.println("double d:"+d);
		return d*d;
	}
	int demo(int a, int b, int c) {
		return a+b+c;
	}
public static void main(String[] args) {
	Overload obj=new Overload();
	double result;
	int add;
	obj.demo(10);
	obj.demo(10, 20);
	result = obj.demo(5.5);
	System.out.println("O/P:"+result);
	add=obj.demo(5, 5, 5);
	System.out.println("O/P:"+add);
}
}


