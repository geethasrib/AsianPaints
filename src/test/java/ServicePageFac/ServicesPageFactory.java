package ServicePageFac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPageFactory {
	WebDriver driver;		
@FindBy(xpath="//a[@data-target='#SERVICES']")
WebElement services;
@FindBy(xpath="//a[text()='Painting Services']")
WebElement painting;
@FindBy(xpath="//a[text()='Modular Kitchens']")
WebElement modular;
@FindBy(xpath="//a[text()='Interior Design Services']")
WebElement interior;
@FindBy(xpath="//a[@href='https://www.asianpaints.com/painting-contractors.html']")
WebElement contractors;
@FindBy(xpath="//input[@placeholder='Pincode/Area']")
WebElement pincode;
@FindBy(xpath="//button[@class='ctaText baseBtn']")
WebElement button;
public ServicesPageFactory(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void service()
{
services.click();	
}
public void painting() {
	painting.click();
}
public void modular() 
{
	modular.click();
}
public void interior() {
	interior.click();
}
public void contractors() {
	contractors.click(); 
}
public void pincode() throws InterruptedException {
	pincode.sendKeys("533248");
	Thread.sleep(3000);
}
public void button() {
	button.click();
}
}
