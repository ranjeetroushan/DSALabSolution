package com.learing.BracketBalancing;
import java.util.Stack;
public class BracketBalancing{
//function to check if brackets are balanced
	static boolean checkingBracketsBalanced(String bracketExpression)
	{
		Stack<Character> Stack = new Stack<Character>();
		for (int i = 0; i<bracketExpression.length();i++ )
		{
			char character = bracketExpression.charAt(i);
		if (character == '('	|| character == '['	|| character == '{')
		{
			Stack.push(character);
			continue;
		}
		if (Stack .isEmpty())
			return false;
		char c;
		switch (character) {
		case '}':
		c =  Stack.pop();	
		if (c == '(' || c == '[')
			return false;
		break;
		case ']':
			c = Stack.pop();
			if (c == '(' || c == '{')
				return false;
			break;
			
		
			
		}
		}
		return (Stack.isEmpty());
		
		
	}
	//driver code
	
		public static void main(String[] args) {
		
		String bracketExpression = "(([{}]]))";
		Boolean result;
		result = checkingBracketsBalanced(bracketExpression);
		if (result)
		System.out.println("the entered string has Balanced brackets" );
		else
			System.out.println("the entered String do not contain  Balanced brackets" );

			
	}
}
