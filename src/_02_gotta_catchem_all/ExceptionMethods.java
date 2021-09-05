package _02_gotta_catchem_all;

import java.util.Iterator;

public class ExceptionMethods {
	static double divide(double num1, double num2) throws IllegalArgumentException {
		double quotient = 0.0;
		if (num2 == 0.0) {
			throw new IllegalArgumentException();
		}
		quotient = num1 / num2;
		return quotient;

	}

	static String reverseString(String input) throws IllegalStateException {
		if (input.equals("")) {
			throw new IllegalStateException();
		}
		char[] charArray = input.toCharArray();
		String output = "";
		for (int i = 0; i < charArray.length; i++) {
			output = output + charArray[charArray.length - (i + 1)];
		}
		System.out.println(output);
		return output;
	}

}
