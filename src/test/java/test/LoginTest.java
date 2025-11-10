package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.ProductListPage;

public class LoginTest extends BaseTest{
  
	ProductListPage PL;
	@Test(priority=1)
  public void VerifyLogin() {
	  
	 
	  System.out.println("step3");
	  LoginPage loginpage=new LoginPage(driver);
      System.out.println("step5");
	  loginpage.EnterUsername();
	  loginpage.EnterPassword();
	  loginpage.ClickLoginButton();
	  String Expected="https://www.saucedemo.com/inventory.html";
	  String ActualURL= driver.getCurrentUrl();  
	  Assert.assertEquals(Expected, ActualURL);
	  
  }
  
  @Test(priority=2)
  
   public void VerifyAddToCart() {
	  PL=new ProductListPage(driver);
	  //ProductListPage PL=new ProductListPage(driver);
	  PL.ClickAddTocart();
	  Assert.assertTrue(PL.IsShoppingBadgeDisplayed());
	  //PL.IsShoppingBadgeDisplayed();
	  PL.ClickCartIcon();
  }
  
  @Test(priority=3)
  
  public void VerifyItemAddedToCart() {
	  PL=new ProductListPage(driver);
	  //ProductListPage PL1=new ProductListPage(driver);
	  Assert.assertTrue(PL.IsItemAddedtotheCart());
  }
  
  
}
