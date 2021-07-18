package TestNGFirst.TestNGPractice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TrailTest {
	
	
@Test

	private void testone() {
		
      System.out.println("Test NG installation successfully");
	}
    @Test(invocationCount = 3 )
    private void testtwo() {
  
    	System.out.println("Test two successfully");
		
	}

    @Test(enabled = true)
    private void testenabled() {
    	System.out.println("Test enabled false");
	
	}
    
 
    @Test
    private void ignoretest() {
		System.out.println("ignore test");
	}
    
    @Test
    private void yellow() {
		System.out.println("Yellow");
	}

}
