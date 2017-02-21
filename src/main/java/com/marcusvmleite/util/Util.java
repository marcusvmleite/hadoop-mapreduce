package com.marcusvmleite.util;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Util {

	public static int stringToInt(String input) {
		DecimalFormat df = new DecimalFormat("+#;-#");
		try {
			return df.parse(input).intValue();
		} catch (ParseException e) {
			System.out.println("Invalid temperature format found!");
		}
		return Integer.MIN_VALUE;
	}
	
}
