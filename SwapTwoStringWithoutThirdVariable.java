package com.string;

public class SwapTwoStringWithoutThirdVariable 
{
	public static void main(String...args)
	{
		String s1="java";
		String s2="Kaviya";
		System.out.println("Before Swapping: ");
		System.out.println(s1+" : "+s2+" ");
		//Using third variable:
		
//		String temp=s1;
//		s1=s2;
//		s2=temp;
//		System.out.println("After Swapping: ");
//		System.out.println(s1+" : "+s2+" ");
		
		//without third variables
		
		s1=s1+s2;// int length=s1.length()+s2.length();
		s2=s1.substring(0,s1.length()-s2.length());// 0,14-6==8 
		s1=s1.substring(s2.length());
		System.out.println("After Swapping: ");
		System.out.println(s1+" : "+s2+" ");
		
		
		
		
	}

}
