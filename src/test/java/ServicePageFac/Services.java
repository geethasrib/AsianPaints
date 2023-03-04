package ServicePageFac;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Services {
	WebDriver driver;
  @Test
  public void ServicesTab() throws InterruptedException {
	  System.setProperty("Webdriver.chrome.driver","C:\\Users\\BOLISE\\Downloads\\chromedriver_win32" );
		driver = new ChromeDriver();
		driver.get("https://www.asianpaints.com/");//web driver method
		driver.manage().window().maximize();
//		ServicesPageFactory st = new ServicesPageFactory(driver);
//		st.service();
//		st.painting();
//		st.modular();
//		st.interior();
//		st.contractors();
//		st.pincode();
//		st.button();
  }
}
