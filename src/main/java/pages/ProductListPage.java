package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {
	
	public ProductListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement AddToCart;
	
	@FindBy(className="shopping_cart_link")
	WebElement CartIcon;
	
	@FindBy(className="shopping_cart_badge")
	WebElement ShoppingCartBadge;
	
	@FindBy(id="remove-sauce-labs-backpack")
	WebElement RemoveButtonOnCart;

	
	
    public void ClickAddTocart()
    {
    	AddToCart.click();
    }
    
    public void ClickCartIcon()
    {
    	CartIcon.click();
    }
    
    public boolean IsShoppingBadgeDisplayed()
    {
    	return ShoppingCartBadge.isDisplayed();
    	
    }
    
    public boolean IsItemAddedtotheCart()

    {
    	return RemoveButtonOnCart.isDisplayed();
    }
	
}

