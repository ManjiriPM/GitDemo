package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class browser {
	
	WebDriver driver;
	
	@Test (priority=1)
	public void Webapplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjiri\\eclipse-workspace\\day06\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://numpyninja.com/contact");
		/*driver.get("https://cosmocode.io/automation-practice/");*/
	}
	
	@Test(priority =2)
	public void testcase01(){
		
	        WebElement firstName =  driver.findElement(By.id("input_comp-l1c0ktzj1"));
			firstName.sendKeys("Best Job");
			
			WebElement lastName = driver.findElement(By.name("last-name"));
			lastName.sendKeys("Last");
			
			WebElement button =  driver.findElement(By.id("comp-l1c0ku0e3"));
			button.click();
			
			WebElement state =  driver.findElement(By.xpath("comp-l1c0ku0e3"));
			state.click();
	
	}
	
	public void testcase02() {
		System.out.println();
		
	}
}
