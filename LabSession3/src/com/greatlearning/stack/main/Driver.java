package com.greatlearning.stack.main;

import com.greatlearning.stack.service.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
		// Driver code
		String bracketExpression = "([[{}]])";

		Boolean result;

		result = BalancingBrackets.checkingBracketsBalanced(bracketExpression);

		if (result) {
			System.out.println("The entered String has balanced Brackets");
		} else {
			System.out.println("The entered String doesn't contain Balanced Brackets");
		}
	}

}
