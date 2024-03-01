package testJenkins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginOrangeHRM {

	WebDriver driver=null;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	}
	@Test
	public void loginOrange() throws InterruptedException
	{
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@AfterClass
	public void close()
	{
		//driver.close();
	}
}

