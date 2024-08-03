package com.b12;

public class Employee {
	
	int id;
	String name;
	float salary;
	
	public void Employee1(){
		id=101;
		name = "Suraj";
		salary = 50500.50f;
		
	}

	public static void main(String[] args) {
		Employee E1= new Employee();
		
		E1.Employee1();
		
		/*
		 * System.out.println(E1.id); System.out.println(E1.name);
		 * System.out.println(E1.salary);
		 */
	}

}
