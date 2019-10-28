package utilities;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\TechFiosDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.navigate().to("https://www.inviul.com");
		driver.get("http://techfios.com/test/107/");

		/*WebElement BluebackgroundButton = driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]"));
		BluebackgroundButton.click();*/
		//*[@id=\"extra\"]/button[1]

		// Elements interaction methods

		// driver.close();
		// driver.quit();
		driver.findElement(By.name("submit")).click();

	}

	private static void todo() {
		// TODO Auto-generated method stub

	}

}