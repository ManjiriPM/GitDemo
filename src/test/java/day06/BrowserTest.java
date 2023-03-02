package day06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserTest {
WebDriver driver;	

@Test
public void setup() {
		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Manjiri\\eclipse-workspace\\day06\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/automation-practice-form");
	   
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.click();
		
		//WebElement lastName = driver.findElement(By.id("lastName"));
		//lastName.click();
		
		driver.findElement(By.id("lastName")).click();
		//lastName.click();
		
		
		
		WebElement date = driver.findElement(By.id("dateOfBirthInput"));
		date.click();
		
		driver.findElement(By.id("subjectsContainer")).click();
		
		
		WebElement Address =  driver.findElement(By.xpath("//textarea[contains(@placeholder,'Current Address')]"));
		Address.sendKeys("Last");
		
		WebElement female =  driver.findElement(By.xpath("//label[contains(text(), 'Female')]"));
		female.click();
		
		WebElement Sports =  driver.findElement(By.xpath("//label[contains(text(), 'Sports')]"));
		Sports.click();
		
		WebElement Reading =  driver.findElement(By.xpath("//label[contains(text(), 'Reading')]"));
		Reading.click();
		
		WebElement Music =  driver.findElement(By.xpath("//label[contains(text(), 'Music')]"));
		Music.click();
		
		WebElement select =  driver.findElement(By.xpath("//div[contains(text(), 'Haryana')]"));
		select.click();
		
		
		
		
		
		
		
		
	/*WebElement currentAddress = driver.findElement(By.xpath("//*div[contains(text(),'Current Address')]"));
		currentAddress.click();
		
		textarea[contains(@placeholder="Current Address", @id="currentAddress")]
		
		//div[contains(text(),'Current Address')]
		
		//textarea[@placeholder="Current Address" and @class="form-control"]*/
		
	}


}
