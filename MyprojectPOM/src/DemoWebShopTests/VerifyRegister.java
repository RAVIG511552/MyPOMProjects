package DemoWebShopTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DemoWebShopPOM.RegisterPOM;

public class VerifyRegister {
  
  @Test
  public void checkRegister() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://demowebshop.tricentis.com/register");
	  driver.manage().window().maximize();
	  
	  RegisterPOM rpom=new RegisterPOM(driver);
	  rpom.clickgender();
	  rpom.enterfirstname("Ravi");
	  rpom.enterlastname("g");
	  rpom.enteremailid("ibmtest689@gmail.com");
	  rpom.enterpwd("pwd1234");
	  rpom.confirmpwd("pwd1234");
	  rpom.clickregbtn();
  }
}
