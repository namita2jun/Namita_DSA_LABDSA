package com.greatlearning.stack.service;

import java.util.Stack;

public class BalancingBrackets {

	public static boolean checkingBracketsBalanced(String bracketExpression) {

		Stack<Character> charStack = new Stack<Character>();

		for (int i = 0; i < bracketExpression.length(); i++) {

			char character = bracketExpression.charAt(i);

			if (character == '(' || character == '[' || character == '{') {
				charStack.push(character);
				continue;
			}
			if (charStack.isEmpty())
				return false;

			char ch;
			switch (character) {
			case ')':
				ch = charStack.pop();

				if (ch == '{' || ch == '[')
					return false;
				break;

			case '}':

				ch = charStack.pop();

				if (ch == '(' || ch == '[')
					return false;
				break;

			case ']':

				ch = charStack.pop();

				if (ch == '(' || ch == '{')
					return false;
				break;

			}

		}
		return (charStack.isEmpty());
	}
}