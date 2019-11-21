	package practice;
	
	import java.util.Stack;
	
	public class FlipTheBit {
	
		public static void main(String[] args) {
			
			int a = 32, b = 1;
			FlipTheBit.invertSpecificBit(a,b);
			
		}
	
		
		 static void invertSpecificBit(int num, int bit) 
		    { 
		        String binaryString = Integer.toBinaryString(num);
		        System.out.println("initial binary string : "+ binaryString);
		        char[] charArray = binaryString.toCharArray();
		        Stack<Character> bitStack = new Stack<Character>();
		        
		        for(char ch: charArray) {
		        	
		        	bitStack.push(ch);
		        }
		        
		        int count = 0;
		        int convertedValue=0;
		        String finalBinaryString = "";
		        
		        for (int i = bitStack.size()-1; i >=0; i --) {
					count ++;
					int value = Character.getNumericValue(bitStack.get(i));
					if(count==bit) {
						  value ^= 1;
					}
					
					finalBinaryString = String.valueOf(value)+ finalBinaryString;
					
		        }
		        
		        System.out.println("final Binary String : "+ finalBinaryString);
		        convertedValue = Integer.parseInt(finalBinaryString, 2);
		        System.out.println(convertedValue); 
		    } 
		 
	}
