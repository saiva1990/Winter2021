package tFCRMTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestJunit {
	
	static WebDriver driver;
	
	@Test
	
	public void launchBrowser () {

		
		
		 
		 
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\13142\\Desktop\\Winter2020\\MavenProject\\Drivers\\chromedriver.exe");

                WebDriver driver = new ChromeDriver ();
                
                
                driver.manage().window().maximize();
                
                
                    driver.get("https://techfios.com/test/billing/?ng=admin");
                    
                    driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
                    
                    driver.findElement(By.id("password")).sendKeys("abc123");
                    driver.findElement(By.name("login")).click();
                     driver.close();
   	}     
                
	}


