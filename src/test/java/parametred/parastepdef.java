package parametred;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class parastepdef {
	//WebDriver driver = null;
	
	@Given("open the browser")
	public void open_the_browser() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Kishan B G\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		//driver = new ChromeDriver();
	 System.out.println("giusdfiug");
	}

	@And("user should be in login page")
	public void user_should_be_in_login_page() {
	  // driver.get("https://petstore.octoperf.com/actions/Account.action;jsessionid=27623E42DAB90CD5E8EC490D010546E5?signonForm="); 
	
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
	   
	}

	@And("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    
	}

	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
	    
	}

	@When("user search for the pets")
	public void user_search_for_the_pets() {
	    
	}

}
