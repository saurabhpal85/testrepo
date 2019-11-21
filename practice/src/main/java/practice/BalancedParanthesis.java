package practice;

import java.lang.reflect.Method;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		if(BalancedParanthesis.isBalancedParan("[[{{()}}]]")) {
			
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
		Method[] methods = BalancedParanthesis.class.getMethods();
		for(Method method : methods){
		    System.out.println("method = " + method.getName());
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
