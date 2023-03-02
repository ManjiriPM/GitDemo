package day07;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



@Test

public class xpath {
	
	@Test
	public void setup() {
	WebDriver driver;	
		
	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Manjiri\\eclipse-workspace\\day06\\src\\test\\resources\\Drivers\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoqa.com/automation-practice-form");

		
		System.setProperty("webdriver.Chrome.driver", "");
		
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://cosmocode.io/automation-practice/");	
		

		WebElement firstname = chromedriver.findElement(By.id("firstname"));
		firstname.sendKeys("First");

	}
	
}
	
