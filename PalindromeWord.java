package com.string;

import java.util.HashSet;
import java.util.Set;

public class PalindromeWord {
	public static void main(String... args) 
	{
        int[] array= {1,2,3,9,7,8,4};
        int[] array2= {2,6,9,7,8};
        Set<Integer> duplicate=new HashSet<>();
        for(int element:array)
        {
        	for(int ele:array2)
        	{
        		if(element==ele)
        		{
        			duplicate.add(element);
        			System.out.println("Duplicate elements: "+element);
        		}
        	}
        }
        System.out.println(duplicate);
	}

}