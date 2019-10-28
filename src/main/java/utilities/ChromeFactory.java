package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeFactory {

	static WebDriver driver;
	//static WebElement element;

	public static WebDriver runChrome() {

		System.setProperty("webdriver.chrome.driver", "C:\\TechFiosDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("http://techfios.com/test/101/");
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));*/
		return driver;
	}
	
	
	/* 
Scenario: users should be able to change background color to white
	Given Set SkyWhite Background" button exists 
	When  user  clicks on the White button 
	Then the background color will change to white  */
	
	
	
}