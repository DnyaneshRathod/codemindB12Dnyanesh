package com.b12;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Operators {

	public static void main(String[] args) {
		//Unari Operator (a++,a--)
		
		int a = 10;
		System.out.println(" A is :"+ a++);
		System.out.println(" A is :"+ a++);
		System.out.println(" A is :"+ a++);
		System.out.println(" A is :"+ a++);
		System.out.println(" A is :"+ a);
		System.out.println(" A is :"+ a--);
		System.out.println(" A is :"+ a--);
		System.out.println(" A is :"+ a);
		
		// Assignment Operator (=,+=,-=)
		
		int p = 10;
		int q = 20;
//		int q = p;
//		int p = q;
		
		
	}

}