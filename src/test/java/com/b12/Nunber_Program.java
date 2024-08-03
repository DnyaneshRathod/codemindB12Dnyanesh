package com.b12;

public class Nunber_Program {

	public static void main(String[] args) {
		// 1st variable for print table program using for loop.
		for (int i = 2; i <= 10; i++) {
			// 2nd variable for multiplication
			for (int j = 1; j <= 10; j++) {

				int r = i * j; // multiplication of two no. is Store in result

				System.out.print(r + "\t"); // print result
			}
			System.out.println(" ");
		}
		System.out.println("***********************************************************************************");
		// print table program using while loop.
		int a = 2, R;

		while (a <= 10) {

			int b = 1;
			while (b <= 10) {

				R = a * b;
				System.out.print(R + "\t");

				b++;
				System.out.print("  ");

			}
			System.out.println();
			a++;
		}
		
		System.out.println("*************************************************************************************");


		// Print fibonacci serieese using for loop.

		int p = 0, q = 1, x;
		System.out.print(p + "\t" + q + "\t");

		for (int i = 0; i <= 8; i++) {

			x = p + q;

			System.out.print(x + "\t");

			p = q;
			q = x;
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("*************************************************************************************");
	
	// fibonacci using while loop.
	
	int n = 0, n1 = 1;
	
	System.out.print(n + "\t" + n1 + "\t");
	
	int i = 0;
	while (i <= 20) {
		
		i = n + n1;
		System.out.print(i + "\t");
		
		n = n1;
		n1 = i;
		System.out.print(" ");
		
		i++;
	}
	System.out.println();
	System.out.println("************************************************************************************* ");
	
	// Number is prime or not program
	
	int num = 17, z = 0;
	
	for (i = 0; i <=8; i++) {
		
		if (num % i==0) {
			System.out.println("number is not prime");		
		}
	}
	
	}
}
