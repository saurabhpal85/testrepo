package practice;

import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		
		System.out.println("Ener the Parantheses String");
		Scanner scanner = new Scanner(System.in);
		String paran = scanner.next();
		
		if(BalancedParanthesis.isBalancedParan(paran)) {
			
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
		
	}
	
	public static Boolean isBalancedParan(String paran) {
		char[] characterSeq = paran.toCharArray();
		Stack<Character> charStack = new Stack<Character>();

		for(char c : characterSeq) {
			switch (c) {
			case '(': charStack.push(c); break;
			case '{': charStack.push(c);break;
			case '[': charStack.push(c); break;
			case ']' : if(charStack.isEmpty() ||  charStack.pop() !='[') {
				return false;
			}
			break;
			case '}' : if(charStack.isEmpty() ||  charStack.pop() !='{') {
				return false;
			}
			break;
			case ')' : if(charStack.isEmpty() || charStack.pop() !='(') {
				return false;
			}
			break;	
			default:
				break;
			}
		}
		return charStack.isEmpty();
		
	}
}
