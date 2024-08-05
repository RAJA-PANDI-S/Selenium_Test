package test_package;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

public class BrowserNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\chromedriver-win64\\chromedriver.exe");  
		    WebDriver driver=new ChromeDriver();  
		      
		// Launch website  
		    driver.navigate().to("http://www.google.com/");  
		    driver.manage().window().maximize();  
		          
		    // Click on the search text box and send value  
		    driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Hello World");  
		          
		    // Click on the search button  
		  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div/div[4]/center/input[1]")).click();  
		  
		//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
		  
		    driver.quit();
		    }  
		  
		}  

