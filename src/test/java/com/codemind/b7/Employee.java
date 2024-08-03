package com.codemind.b7;

public class Employee {

	int id;
	String name;
	float salary;

	public void Employee1() {
		System.out.println(id = 101);
		System.out.println(name = "Suraj");
		System.out.println(salary = 50500.50f);
	}

	public void Working() {
		System.out.println("Suraj is working");
	}

	public void Traveling() {
		System.out.println("Suraj is traveling");
	}

	public void Employee2() {
		System.out.println(id = 201);
		System.out.println(name = "Rajesh");
		System.out.println(salary = 45500.90f);
	}

	public void Working_Fom_Home() {
		System.out.println("Rajesh is working from home");
	}
 
	public void Not_Traveling() {
		System.out.println("Rajesh is not traveling");
	}

	public static void main(String[] args) {
		Employee E1 = new Employee();
		Employee E2 = new Employee();

		E1.Working();
		E1.Traveling();
		E1.Employee1();

		E2.Working_Fom_Home();
		E2.Not_Traveling();
		E2.Employee2();
	}
}
