package day06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceDome {
	WebDriver driver;
	

@Test
public void setup() {
		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Manjiri\\eclipse-workspace\\day06\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/inventory.html");
	   
		
		WebElement userName = driver.findElement(By.xpath("//input[contains(@placeholder, 'Username')]"));
		userName.sendKeys("standard_user");
		
		WebElement passWord = driver.findElement(By.xpath("//input[contains(@placeholder, 'Password')]"));
		passWord.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		
		WebElement TshirtRed = driver.findElement(By.id("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
		TshirtRed.sendKeys("hello");
				
		

		}


}
