package dwspagefactorydemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactoryDemo {
	
	WebDriver driver;
	
	@FindBy(id="Email")
	WebElement email;

	@FindBy(name="Password")
	WebElement pwd;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement login;
	
	public LoginPageFactoryDemo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enteremail(String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public void enterpassword(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void clicklogin()
	{
		login.click();
	}
}
