package Maven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
		public void setUp(){
		driver = new FirefoxDriver();
	}
	@Test
	public void doLogin()
	{
		driver.get("https://mail.google.com");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("anujcs2002");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/content/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div/div/div[1]/div/div[1]/input")).sendKeys("Kismat01!");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[3]/div[2]/div[1]/div/content/span")).click();
	}
	
  @AfterSuite
  public void tearDown()
  {
	  driver.quit();
  }
}
