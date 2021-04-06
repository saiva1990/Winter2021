package tFCRMTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	
	public static void main (String [] args) {
		
		launchBrowser ();
		loginTest();
		tearDown();
	}
	
	public static void launchBrowser () {

	
		
 
 
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\13142\\Desktop\\Winter2020\\MavenProject\\Drivers\\chromedriver.exe");
 
                 WebDriver driver = new ChromeDriver ();
                 
                 
                 driver.manage().window().maximize();
                 
	}
	
	public static void loginTest() {
                 driver.get("https://techfios.com/test/billing/?ng=admin");
                 
                 driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
                 
                 driver.findElement(By.id("password")).sendKeys("abc123");
                 driver.findElement(By.name("login")).click();
                 
	}     
	
	
	public static void tearDown() {
                 driver.close();
                 
                 
                 
                 
                 
	}

}
