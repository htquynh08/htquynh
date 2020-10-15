package PracticeMaven;

import static org.testng.Assert.fail;
import java.util.concurrent.TimeUnit;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;			
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;	

public class Setup {		
	    public static WebDriver driver;	
	    public static WebDriverWait myWait;			
		public static void accessURL(String url, String text)
		{
			try
			{
				driver.get(url);
			}
			catch (Exception e)
			{
				fail("Fail to open URL: " + url);
			}
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains(text));
		}
		
		
		@BeforeTest
		public static void beforeTest() {
			System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			accessURL("https://www.google.com/", "Google");
		}		
		@AfterTest
		public static void afterTest() {
			driver.quit();			
		}		
}	