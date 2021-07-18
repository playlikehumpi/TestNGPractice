package TestNGFirst.TestNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "Dev Data")
	private void loginDetails(String username, String password) {
		System.out.println("Username " + username);
		System.out.println("Password " + password);

	}

	@DataProvider(name = "Dev Data")
    private Object[][] inputData()
    {
		return new Object[][] {{"test","test123"}, {"test2","test1234"}, {"test3","test12345"}};
    }
	
	
	
}
