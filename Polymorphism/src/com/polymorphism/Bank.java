package com.polymorphism;

public class Bank {
	int getRateofinterest() {
		return 0;
	}

}

class SBI extends Bank {
	int getRateofinterest() {
		return 8;
	}

}

class ICICI extends Bank {
	int getRateofinterest() {
		return 10;
	}

}

class Axis extends Bank {
	int getRateofinterest() {
		return 12;
	}

}

class Override_test {
	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println("Bank rate of interest" + b.getRateofinterest() + "%");

		Bank b1 = new SBI();
		Bank b2 = new ICICI();
		Bank b3 = new Axis();

		System.out.println("SBI rate of interest" + b1.getRateofinterest() + "%");
		System.out.println("ICICI rate of interest" + b2.getRateofinterest() + "%");
		System.out.println("Axis rate of interest" + b3.getRateofinterest() + "%");

		System.out.println();

	}
}
