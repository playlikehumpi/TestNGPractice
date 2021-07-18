package TestNGFirst.TestNGPractice;

import java.lang.ProcessBuilder.Redirect;

import org.testng.annotations.Test;

public class PriorityException {

	@Test(priority = 1)
	private void openTheCar() {
		System.out.println("open the car");
	}
	@Test(priority = 2)
	private void sitAtDriverSeat() {

		System.out.println("Driver Seat");
	}
	@Test(priority = 3)
	private void startTheCar() {
		System.out.println("start the car");

	}
	@Test(priority = 4)
	private void removeHandGear() {
		System.out.println("removeHandGear");
	}
	
	
	@Test(dependsOnMethods = "openTheCar")	
	private void Red() {
		
		System.out.println("open the car");
	
	}

}
