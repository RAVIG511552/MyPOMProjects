package dwspagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dwspagefactorydemo.LoginPageFactoryDemo;

public class VerifyLogin {
  
  @Test
  public void checklogin() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://demowebshop.tricentis.com/login");
	  driver.manage().window().maximize();
	  
	  LoginPageFactoryDemo loginpage=PageFactory.initElements(driver, LoginPageFactoryDemo.class);
	  loginpage.enteremail("naniravi4664@gmail.com");
	  loginpage.enterpassword("pwd@123");
	  loginpage.clicklogin();
  }
}
