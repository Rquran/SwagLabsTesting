package swag_lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class TitleTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\MyChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		String user_name ="standard_user";
		String password = "secret_sauce";
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user_name);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		String atualTitle = driver.getTitle();
		String expectedTitle = "Swag Labs";
		Assert.assertEquals(atualTitle, expectedTitle);


		
		
		
		
	}

}
