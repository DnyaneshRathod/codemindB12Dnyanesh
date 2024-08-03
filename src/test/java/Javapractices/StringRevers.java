package Javapractices;

public class StringRevers {

	public static void main(String[] args) {
	
		String s="Welcome To Codemind";
		
		System.out.println(s);
		
		//System.out.println(s.replace('c', 'b'));
		//System.out.println(s.replace("come","go"));
		
		// Revers String
		
		String ss="Welcome To Codemind Technology";
				
	    String sss="";
		
		for(int i=ss.length()-1;i>=0;i--)
		{
			sss=sss+ss.charAt(i);
		}
		
		System.out.println(sss);
	}

}
