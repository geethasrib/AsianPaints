package com.demo.AsianPaints;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServicesStepDefination {
	WebDriver driver;	

	@Given("I am on the Asian Paints Website")
	public void i_am_on_the_Asian_Paints_Website() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\BOLISE\\Downloads\\chromedriver_win32" );
		driver = new ChromeDriver();
		driver.get("https://www.asianpaints.com/");//web driver method
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
	
   }

	@When("I click on the Services tab")
	public void i_click_on_the_Services_tab() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[@data-target='#SERVICES']"))).perform();
		Thread.sleep(1000);
	}

	@Then("I should see a list of available services")
	public void i_should_see_a_list_of_available_services() {
		driver.close();
	}

	@When("I click on the Painting Services")
	public void I_click_on_the_Painting_Services() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[@data-target='#SERVICES']"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Painting Services']"))).click().perform();
		Thread.sleep(1000);
	}

	@Then("I should be taken to the painting page")
	public void i_should_be_taken_to_the_painting_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	}
	@When("I click on Modular Page")
	public void i_click_on_Modular_Page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[@data-target='#SERVICES']"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Modular Kitchens']"))).click().perform();
		Thread.sleep(1000);
	}

	@Then("I should be taken to the Modular Kitchen page")
	public void i_should_be_taken_to_the_Modular_Kitchen_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	}

	@When("I click on the Interior Design Services")
	public void i_click_on_the_Interior_Design_Services() throws InterruptedException {
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[@data-target='#SERVICES']"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Interior Design Services']"))).click().perform();
		Thread.sleep(1000);

	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("I should be taken to the Interior Design Services")
	public void i_should_be_taken_to_the_Interior_Design_Services() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	}
	@When("I select Find a Contractor")
	public void i_select_Find_a_Contractor() throws InterruptedException {
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[@data-target='#SERVICES']"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[@href='https://www.asianpaints.com/painting-contractors.html']"))).click().perform();
		Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@When("I should enter valid {string}")
	public void i_should_enter_valid(String string) 
	{
		driver.findElement(By.xpath("//input[@placeholder='Pincode/Area']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("I click on search")
	public void i_click_on_search() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='ctaText baseBtn']")).click();
		Thread.sleep(3000);
	    // Write code here that turns the phrase above i2nto concrete actions
	}

	@Then("I should see a list of Contractors")
	public void i_should_see_a_list_of_Contractors() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	}
	
}


