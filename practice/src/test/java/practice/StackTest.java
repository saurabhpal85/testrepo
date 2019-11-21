package practice;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class StackTest {
	
	private Stack<String> s;
	
//	@InjectMocks
//	private BalancedParanthesis balancedParanthesis;
//	
	@Before
	public void seup() {
		s = new Stack<String>();
	
	}
	
	@Test
	public void testBalanced(){
		String paran = "[[{{}}]]";
		Boolean isBalanced = BalancedParanthesis.isBalancedParan(paran);
		assertEquals("Balanced", true, isBalanced);
	}
	
	@Test
	public void testUnbalanced(){
		String paran = "[[{{}}]]]";
		Boolean isBalanced = BalancedParanthesis.isBalancedParan(paran);
		assertEquals("Not Balanced", false, isBalanced);
	}
}
