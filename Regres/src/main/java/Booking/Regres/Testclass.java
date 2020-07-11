package Booking.Regres;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public void loginhomepage()
	{
		 System.setProperty("webdriver.chrome.driver","/Users/Roselin/eclipse-workspace/chromedriver 16");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.google.com");
	     driver.close();
	     driver.quit();
	}
	

}
