package pages;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;

public class NewTest  extends Pages{
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  NewTest test=new NewTest();
	  test.Login();
		WebDriver driver = null;
		driver.get("https://affiliate.flipkart.com/login");
		driver.findElement(By.id("inputEmail")).sendKeys("bala.neyveli1@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("2293");
		driver.findElement(By.id("submitLogin")).click();
		
  }

}
