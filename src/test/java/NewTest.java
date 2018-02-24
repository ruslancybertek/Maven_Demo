import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver driver;
  @Test
  public void mavenTest() {
	  WebElement search_box = driver.findElement(By.name("q"));
		search_box.sendKeys("porsche" + Keys.ENTER);
		Assert.assertTrue(driver.getTitle().contains("porsche"));
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("http://google.com");
	  
  }
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  
  }
}
