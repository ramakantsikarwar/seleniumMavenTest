package example;		
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("https://www.myntra.com/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Driver\\chromedriver.exe");
		    driver = new ChromeDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	