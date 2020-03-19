package DemoWebShopPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPOM {
	
	WebDriver driver;
	
	By gender=By.name("Gender");
	By fname=By.id("FirstName");
	By lname=By.name("LastName");
	By email=By.id("Email");
	By password=By.xpath("//input[@id='Password']");
	By cpassword=By.name("ConfirmPassword");
	By rbutton=By.id("register-button");
	
	public RegisterPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickgender()
	{
		driver.findElement(gender).click();
	}
	
	public void enterfirstname(String fn)
	{
		driver.findElement(fname).sendKeys(fn);
	}
	
	public void enterlastname(String ln)
	{
		driver.findElement(lname).sendKeys(ln);
	}
	
	public void enteremailid(String em)
	{
		driver.findElement(email).sendKeys(em);
	}
	
	public void enterpwd(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void confirmpwd(String cpwd)
	{
		driver.findElement(cpassword).sendKeys(cpwd);
	}
	
	public void clickregbtn()
	{
		driver.findElement(rbutton).click();
	}
}
