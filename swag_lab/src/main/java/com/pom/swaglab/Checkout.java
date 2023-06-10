package com.pom.swaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement button_Checkout;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement txt_FirstName;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement txt_LastName;
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement txt_ZipCode;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement button_Continue;
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement button_Finish;
	
	public Checkout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Clickon_Checkout() {
		button_Checkout.click();
	}
	public void Enter_FirstName() {
		txt_FirstName.sendKeys("Pramod");
	}
	public void Enter_LastName() {
		txt_LastName.sendKeys("Yadav");
	}
	public void Enter_Zipcode() {
		txt_ZipCode.sendKeys("411052");
	}
	public void ClickOn_Continue() {
		button_Continue.click();
	}
	public void ClickOn_Finish() {
		button_Finish.click();
	}
	

}
