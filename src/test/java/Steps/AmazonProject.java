package Steps;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonProject {
	
	
// A step definition file is a java file
// In the steps definition file we implement 
//the steps written for a scenario in featurefile
// Every steps is a test method
// Every Gherkin keyword used in featurefile is an annotation in this file
// we never execute this file
// the steps are implemented in the following way:
	
	 WebDriver driver;
	 @Before(order = 0,value="@regression")
	 
	 @Given("I open the browser and enter URL")
	 public void i_open_the_browser_and_enter_url() {
		 
		  driver = new ChromeDriver();
		   driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			
		}

	 @Then("I click on the signin button")
	 public void i_click_on_the_signin_button() throws InterruptedException {
		 driver.findElement(By.linkText("Sign in")).click();
			
			
		Thread.sleep(3000);
	   
	 }

	 @When("I enter email and password")
	 public void i_enter_email_and_password(){
		 driver.findElement(By.id("ap_email")).sendKeys("tanyayadav507@gmail.com");
			driver.findElement(By.xpath("//input[@id='continue']")).click();
			driver.findElement(By.id("ap_password")).sendKeys("Amazon#08");
			driver.findElement(By.id("signInSubmit")).click();
			
	  
	 }

	 @Given("It search for iphone13")
	 public void it_search_for_iphone13() throws InterruptedException {
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
			
			driver.findElement(By.id("twotabsearchtextbox")).submit();
			
			Thread.sleep(1500);
	 }
	    
	

	 @Then("It clicks on it")
	 public void it_clicks_on_it() throws InterruptedException {
		 
			driver.findElement(By.xpath("(//div[@class='a-section'])[2]/descendant::span[11]")).click();
			
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
			
			driver.switchTo().window(tabs.get(1));
			
			Thread.sleep(1500);
	 }
	  
	 

	 @Then("adds it to the wishlist")
	 public void adds_it_to_the_wishlist() {
		 driver.findElement(By.id("wishlistButtonStack")).click();
			
			driver.quit();
			
	 }
}
