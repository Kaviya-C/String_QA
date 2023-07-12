package com.string;

class A
{
	
}
class B{
	
}
public class StringTopics 
{
	public static void main(String...args)
	{
		String s="Java Concept";
		char[] chars=new char[s.length()];
		String s1=new String(chars);
		
		System.out.println(s1);
		
		StringBuffer sb=new StringBuffer("Java Developer");
		String s3=new String(sb);
		System.out.println(s3);
		String s4=10+10+s1;
		System.out.println(s4);
		
		A a=new A();
		String s5=s4+a;
		System.out.println(s5);

		String s6="Arun";
		System.out.println(s6.charAt(3));
		s.getChars(0, s.length(), chars,0);
		System.out.println(chars);
		s="Kaviya output";
		char[] c=s.toCharArray();
	for(char re:c)
		{
			System.out.print(re+" ");
		}
    String k="Kaviya Java Developer";
    int length=k.length()-1;
    System.out.println(k.substring(0,length+1));
		
		String e=new String("java");
		String str="java";
		System.out.println(e.equals(str));
		String j="java";
		String i=new String("java");
		System.out.println(e==i);
		
		
		String str2="Java";
		str2.concat("J2EE");
		s1+=" developer Kaviya";
		System.out.println(s1);
		
		String sA=new String("java");
     	String sB=new String("java");
		System.out.println(sA==sB);
		System.out.println(sA.equals(sB));
	   System.out.println(sA.hashCode()+" : "+sB.hashCode());
		
		String name="Kaviya";
		name.concat(" Java developer");
		
		System.out.println(name);
		
		StringBuffer sbf=new StringBuffer("Java Developer");
		
		StringBuffer result= sbf.append(" Kaviya In Top StartUp Company");
		System.out.println(result);

    
	}

}
