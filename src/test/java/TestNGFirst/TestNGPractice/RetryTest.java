package TestNGFirst.TestNGPractice;

import org.testng.annotations.Test;

public class RetryTest {
	
	@Test(retryAnalyzer = MyRetry.class)
	private void testDemo() {
		
		System.out.println(10/0);	
			
	}
	@Test
	private void testDemo1() {
		System.out.println(10/5);
	}

}
