package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
	   System.out.println("step4");
	   PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	WebElement UsernameField;
	
	@FindBy(id="password")
	WebElement PasswordField;
	
	@FindBy(id="login-button")
	WebElement LoginButton;
	
	public void EnterUsername()
	{
		System.out.println("step6");
		UsernameField.sendKeys("standard_user");
		
	}
	
	public void EnterPassword()
	{
		System.out.println("step7");
		PasswordField.sendKeys("secret_sauce");
	}

	public void ClickLoginButton()
	{
		System.out.println("step8");
		LoginButton.click();
	}
 }
