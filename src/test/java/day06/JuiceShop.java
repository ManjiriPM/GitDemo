package day06;

import java.time.Duration;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JuiceShop {
	@FindBy(id = "email")
	WebElement emailTextBox;
	
	@FindBy(id = "password")
	WebElement passwordTextBox;
	
	@FindBy(id ="loginButton")
	WebElement loginButton;

	WebDriver chromeDriver = new ChromeDriver();
	
	
@Test	
public void openApplicaton() {
		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Manjiri\\eclipse-workspace\\day06\\src\\test\\resources\\Drivers\\chromedriver.exe");
		//WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://juice-shop.herokuapp.com/#/login");
		//chromeDriver.get("https://juice-shop.herokuapp.com/#/search");
		
		chromeDriver.manage().window().maximize();
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//chromeDriver.switchTo().alert().dismiss();
		
		PageFactory.initElements(chromeDriver,this);
		emailTextBox.sendKeys("manj@gmail.com");
		passwordTextBox.sendKeys("manj123");
		loginButton.sendKeys(Keys.ENTER);
		
		chromeDriver.findElement(By.xpath("//div[@class='cc-compliance']/a")).click();
		chromeDriver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		//div[text()=' Apple Juice (1000ml) ']/../../../div[2]/button
		
		WebElement appleJuice =  chromeDriver.findElement(By.xpath("//div[contains(text(), ' Apple Juice (1000ml) ')]//parent::div//parent::div//parent::mat-card[@class='mat-card mat-focus-indicator mat-elevation-z6 ribbon-card']/child::div[2]"));
		appleJuice.click();
		
		WebElement eggfruit =  chromeDriver.findElement(By.xpath("//div[contains(text(), 'Eggfruit Juice (500ml)')]//parent::div//parent::div//parent::mat-card[@class='mat-card mat-focus-indicator mat-elevation-z6 ribbon-card']/child::div[2]"));
		eggfruit.click();
		
		/*WebElement lemonJuice =  chromeDriver.findElement(By.xpath("//div[contains(text(), 'Lemon Juice (500ml)')]//parent::div//parent::div//parent::mat-card[@class='mat-card mat-focus-indicator mat-elevation-z6 ribbon-card']/child::div[2]"));
		lemonJuice.click();*/
		
		WebElement basket =  chromeDriver.findElement(By.xpath("//span[text()=' Your Basket']"));
		basket.click();
		
		
		increaseQty();
	    
		
	}
public void increaseQty() {
	//Thread.sleep(2000);

	List<WebElement> btnsAdd = chromeDriver.findElements
			(By.xpath("//mat-table/mat-row/mat-cell[3]/button[2]")); 
	
	for (WebElement btnAdd : btnsAdd) {
		btnAdd.sendKeys(Keys.ENTER);
	
	
}


}

}
