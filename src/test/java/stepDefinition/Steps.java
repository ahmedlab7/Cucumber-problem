package stepDefinition;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import utilities.ChromeFactory;
import utilities.IsColorRight;

public class Steps {
	WebDriver driver;
	HomePage todoPage;

	@Before
	public void init() {

		driver = ChromeFactory.runChrome();
		todoPage = PageFactory.initElements(driver, HomePage.class);

	}

	@Given("^set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() {

	}

	@When("^user clicks on the button$")
	public void user__clicks_on_the_button()  {

		//Thread.sleep(2000);

		try {
			todoPage.changeColorToBlue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue()  {
		String expectedColor = "background-color: skyblue;";
		IsColorRight.contains("Sky Blue color displayed!", expectedColor, todoPage.getPageColor());
	}

	@Given("^Set SkyWhite Background\" button exists$")
	public void set_SkyWhite_Background_button_exists() throws Throwable {

	}

	@When("^user  clicks on the White button$")
	public void user_clicks_on_the_White_button() throws Throwable {

		Thread.sleep(2000);

		todoPage.changeColorToWhite();

	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {

	}

	@After
	public void afterRun() throws InterruptedException {
		Thread.sleep(3000);
		todoPage.close();
	}
}