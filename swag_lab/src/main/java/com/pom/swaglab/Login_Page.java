package com.pom.swaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {


	@FindBy(xpath="//input[@name='user-name']")
	private WebElement txt_Username;

	@FindBy(xpath="//input[@name='password']")
	private WebElement txt_Password;

	@FindBy(xpath = "//input[@name='login-button']")
	private WebElement button_Login;

	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Enter_Username() {
		txt_Username.sendKeys("standard_user");
	}
	public void Enter_Password() {
		txt_Password.sendKeys("secret_sauce");
	}
	public void Click_On_Login() {
		button_Login.click();
	}

}
