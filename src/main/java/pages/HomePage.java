package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	WebDriver driver;

	

	public HomePage(WebDriver driver ){
		super();
		this.driver = driver;
		
	}

	

	@FindBy(xpath = "//*[@id=\"extra\"]/button[1]")
	public WebElement BluebackgroundButton;
	@FindBy(xpath = "//*[@id=\"extra\"]/button[2]")
	public WebElement WhiteButton;
	
	public void changeColorToBlue() throws InterruptedException {
		
		 Thread.sleep(5000);
		 BluebackgroundButton.click();
	
	}
	
	public void changeColorToWhite() throws InterruptedException {
		
		 Thread.sleep(5000);
		 WhiteButton.click();
	}

	public String getPageColor() {
		return driver.getTitle();
	}

	public void close() {
		driver.close();
	}
}