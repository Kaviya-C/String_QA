package com.string;

import java.text.DecimalFormat;

public class PercentUpperLowerDigitsSpecial {
	public static void characterPercentage(String s) {
		int length = s.length();
		int upper = 0;
		int lower = 0;
		int special = 0;
		int digit = 0;

		for (int index = 0; index < s.length(); index++) {
			char ch = s.charAt(index);

			if (Character.isUpperCase(ch)) {
				upper++;
			} else if (Character.isLowerCase(ch)) {
				lower++;
			} else if (Character.isDigit(ch)) {
				digit++;
			} else {
				special++;
			}
		}

		double upperPercent = (upper * 100.00) / length;
		double lowerPercent = (lower * 100.00) / length;
		double specialPercent = (special * 100.00) / length;
		double digitPercent = (digit * 100.00) / length;

		DecimalFormat d = new DecimalFormat("##.##");
		System.out.println("Upper Percentage: " + d.format(upperPercent) + " %");
		System.out.println("Lower Percentage: " + d.format(lowerPercent) + " %");
		System.out.println("Special character percentage: " + d.format(specialPercent) + " %");
		System.out.println("Digits Percentage: " + d.format(digitPercent) + " %");
	}

	public static void main(String... args) {
		characterPercentage("Ti98765rfgRuns @ The Speed Of 100 km/hour");
	}

}
