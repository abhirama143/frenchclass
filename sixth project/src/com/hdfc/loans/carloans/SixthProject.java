package com.hdfc.loans.carloans;

public class SixthProject implements SeventhProject {
	
	int a=10,b=20,c=0;
	
	public void addition()
	{
		c=a+b;
		System.out.println("addition of a&b are:"+c );
	}
	
	public static void main(String[] arsg) {
		// TODO Auto-generated method stub
	SixthProject obj=new SixthProject();
	obj.addition();
	obj.multiplication();
		
		
	}

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		System.out.println("multiplication override method in seventhproject");
	}
	

}
