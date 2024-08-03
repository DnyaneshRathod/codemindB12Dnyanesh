package com.codemind.b7;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();

		obj.sum();
	    obj.sum(10);
	    obj.sum(10, 20);
	}
	
	
    public static void main(int i) {   
		
	}
    
    
    public static void main(int j, int s ) {   
		
	}
	
	//we can over load main method also.


	
	// you can not create method inside method.
	//duplicate method---i.e. same method name with same number of arguments are not allowed.
	
	// method over loding---->when method name is same with different argument or input parameters within the same class.
	
	
	
	public void sum() {
		
		// zero input parameter
		
		System.out.println("Sum method ----With zero param----");
		 
	}
	
    public void sum(double d) {   
		
	}
	
	
	public void sum(int a) {
		
		//One input Parameter
		
		System.out.println("sum method----with 1 param");
		
		System.out.println(a);
		
	}

public void sum(int c, int b) {
	
	//Two Parameters
		
		System.out.println("sum method----with 2 Param");
		
		System.out.println(c+b);
		
	}

}
    