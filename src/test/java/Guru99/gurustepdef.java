package Guru99;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import io.cucumber.datatable.DataTable;
	import io.cucumber.java.After;
	import io.cucumber.java.Before;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	//import Guru99Bank.Guru99BankHooks;
	

	public class gurustepdef {
	    WebDriver driver = null;
	    @Before ()
	    public void setUp(){    
	         System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/chromedriver.exe"); 
	         driver = new FirefoxDriver();    
	       }    

	    @Given("^User navigates to \"([^\"]*)\"$")
	    public void User_navigates_to_Guru99Bank() {
	         driver.navigate().to("http://demo.guru99.com/V4"); 
	    }
	 
	    @When("^User enters valid credentials$")
	    public void User_enters_valid_credentials(){ 

	          //List<List<String>> data = usercredentials.raw();
	          //Enter data
	          driver.findElement(By.name("uid")).sendKeys("abbey"); 
	          driver.findElement(By.name("password")).sendKeys("Cg");
	          driver.findElement(By.name("btnLogin")).click();

	    }

	    @Then("^User Login Successful$")
	    public void User_Login_Successful() {
	         if(driver.getCurrentUrl().equalsIgnoreCase("http://demo.guru99.com/V4/manager/Managerhomepage.php")){
	             System.out.println("Login Passed"); 
	          } else { 
	             System.out.println("Login Failed"); 
	          } 

	    }

	    @After public void closeBrowser(){    
	          driver.close();    
	    }
}
