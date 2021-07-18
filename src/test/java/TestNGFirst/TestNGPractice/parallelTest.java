package TestNGFirst.TestNGPractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallelTest {
	
	@Test
	public void facebook() {

		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse Workarea\\TestNGPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

	}

	
	@Test
	public void instagram() {

		System.setProperty("webdriver.gecko.driver", "F:\\Eclipse Workarea\\TestNGPractice\\Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.instagram.com/");

	}

}
