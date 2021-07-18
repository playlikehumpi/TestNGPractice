package TestNGFirst.TestNGPractice;

import org.testng.annotations.Test;

public class GroupingTest {
	@Test(groups="colour")
	private void red() {
		
		System.out.println("Red test case");
		
	}
	@Test(groups="colour")
	
	private void green() {
		System.out.println("green test case running");
		
	}
	
	@Test(groups="colour")
	private void blue() {
		System.out.println(" blue test case is running");
		
	}
	@Test(groups="colour")
	private void readBooks() {
		System.out.println("reading book test case ");
		
	}
}
