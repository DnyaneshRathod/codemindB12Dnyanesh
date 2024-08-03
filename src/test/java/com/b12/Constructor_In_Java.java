package com.b12;

//constructor program

public class Constructor_In_Java {

	public static void main(String[] args) {

		// Student student = new Student(101, "Laksha Sen", 90);
		// student.pass();
		// student.fail();
		Student st = new Student();
	}
}
class Student {
	// instance menber variavles
	int Rollno;
	String name;
	float marks;

	// parameterised constructor
	public Student(int Rollno, String name, float marks) {

		this.Rollno = Rollno;
		this.name = name;
		this.marks = marks;
		System.out.println(Rollno + "\t" + name + "\t" + marks + "\t");

		System.out.println("parameterised constructor is called");

		// System.out.println("*********************************************************************************");
	}

	// Default constructor
	public Student() {
		this.Rollno = Rollno;
		this.name = name;
		this.marks = marks;

		System.out.println("Default constructor is called");

		System.out.println(Rollno + "\t" + name + "\t" + marks + "\t");

	}

	// instance menber functions/ methods

	public void pass() {
		System.out.println("Student is pass");
	}

	public void fail() {
		System.out.println("Student is faill");
	}
}
