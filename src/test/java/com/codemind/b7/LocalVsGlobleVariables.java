package com.codemind.b7;

public class LocalVsGlobleVariables {
	
	// Globle varible----Class varibles
	int age = 25;
	String name = "Selenium";

	public static void main(String[] args) {
		
		LocalVsGlobleVariables obj = new LocalVsGlobleVariables();
		
		int i = 10;  //local varibles

		System.out.println(i);
		System.out.println(obj.age);
		System.out.println(obj.name);
		
		//  System.out.println(obj.j);
	}

	public void sum() {
		
		
		//local varibles
		int i = 15;
		int j = 20;
		int age = 25;
	}
}
