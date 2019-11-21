	package practice;

import java.util.Scanner;

public class FlipTheBit {
	
		public static void main(String[] args) {
			int num;
			int bit;
			System.out.println("Enter the Number \n");
			Scanner scanner = new Scanner(System.in);
			num = scanner.nextInt();
			System.out.println("Enter the bit to flip \n");
			Scanner scanner1 = new Scanner(System.in);
			bit = scanner1.nextInt();
			FlipTheBit.invertSpecificBit(num, bit);
			
		}
	
		
		 static void invertSpecificBit(int num, int bit) 
		    {
			 
			 System.out.println("Before "+num); 
			 System.out.println("Before " + Integer.toBinaryString(num)); 
			 num ^= (1<<(bit-1));
			 System.out.println("After" + Integer.toBinaryString(num));
			 System.out.println("After "+num); 
		    } 
		 
	}
