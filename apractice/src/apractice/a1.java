package apractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class a1 {
	@Test
	public void river(){
		System.setProperty("Webdriver.Chrome.Driver","ChromerDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Tapti_River");
		
		
	}

}



