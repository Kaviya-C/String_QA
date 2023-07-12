package com.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedFirstNonRepeatedChar 
{
	public static void firstRepeatFirstNonRepeat(String s)
	{
		Map<Character,Integer> charCount=new HashMap<>();
		
		char[] character=s.toCharArray();
		//System.out.println(Arrays.toString(character));
		for(char letter:character)
		{
			if(charCount.containsKey(letter))
			{
				//System.out.println("00");
				charCount.put(letter, charCount.get(letter)+1);
			}
			else
			{
				charCount.put(letter,1);
			}
		}
		//System.out.println(charCount.toString());
		for(char nonRepeat:character)
		{
			if(charCount.get(nonRepeat)==1)
			{
				System.out.println("Non repeated:  "+nonRepeat);
			    break;
			}
		}
		for(char repeat:character)
		{
			if(charCount.get(repeat)>1)
			{
				System.out.println("Repeated : "+repeat);
				break;
			}
		}
	}
	public static void main(String...args)
	{
		firstRepeatFirstNonRepeat("sarasWathi");
	}

}
