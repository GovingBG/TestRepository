package GoogleImage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

public class GoogleImage {
WebDriver driver;
@Given("^Navigate to Google$")
public void Navigate_to_Google() {
	throw new PendingException();
	
}
@When("^User clicks on Images hyperlink$")
public void User_clicks_on_hyperlink() {
	driver.findElement(By.linkText("Images")).click();
}
@Then("^User should be redirected to Google Images page$")
public void User_should_be_redirected_to_Google_Images_page() {
	if(driver.getTitle().equalsIgnoreCase("Google Imagesa")) {
		System.err.println("Navigate to Google Image Page");
	}
	else
	{
		System.err.println("Not on Google Image Page");
	}
	driver.close();
}
}
