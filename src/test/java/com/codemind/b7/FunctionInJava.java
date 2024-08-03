package com.codemind.b7;

public class FunctionInJava {

	public static void main(String[] args) {
		
		FunctionInJava obj = new FunctionInJava();
		
		obj.test();
		System.out.println(" ");
	    int	l= obj.pqr();
	    System.out.println(l);
	    System.out.println(" ");
	    
	    String q=obj.qa();
		System.out.println(q);
		System.out.println(" ");
		
		int div=obj.divison(30, 10);
		System.out.println(div);
		
	}
	
	//non static methods
	
	  public void test() {
		  
		  System.out.println("test method");
	  }
	
	public int pqr() { 
		
		System.out.println("pqr method");
		
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;		
		
	}

	public String qa() {
		
		System.out.println("qa method");
		
		String S1 = "Selenium";
		
		return S1;
	}
	
	public int divison(int x, int y) {
		
		System.out.println("divison method");
		
		int d = x/y;
		
		return d;
	}
}
