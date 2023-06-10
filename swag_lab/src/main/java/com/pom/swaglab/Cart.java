package com.pom.swaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	
	
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement button_Add_to_CartElement;
	
	@FindBy(xpath="//*[@class='shopping_cart_link']")
	private WebElement button_Cart;
	
	public Cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Click_on_AddtoCart() {
		button_Add_to_CartElement.click();
	}
	public void Click_on_Cart() {
		button_Cart.click();
	}

}
