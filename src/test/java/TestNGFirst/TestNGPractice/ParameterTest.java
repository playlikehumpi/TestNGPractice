package TestNGFirst.TestNGPractice;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	@Parameters({ "name" })
	@Test
	private void username(@Optional("Jack") String name) {
		System.out.println("Username " + name);
	}

	@Parameters({ "password" })
	@Test
	private void password(@Optional("Jill565") String password) {
		System.out.println("Password  " + password);
	}

}
