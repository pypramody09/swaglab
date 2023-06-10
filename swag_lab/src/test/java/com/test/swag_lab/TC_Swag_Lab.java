package com.test.swag_lab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import com.base.swaglab.Browser_Invocation;
import com.pom.swaglab.Cart;
import com.pom.swaglab.Checkout;
import com.pom.swaglab.Login_Page;





public class TC_Swag_Lab extends Browser_Invocation {

	@Test(priority = 1)
	public void LoginPage() {

		Login_Page lp = new Login_Page(driver);
		lp.Enter_Username();
		lp.Enter_Password();
		lp.Click_On_Login();

	}

	@Test(priority = 2)
	public void ProductCart() {
		Cart cart = new Cart(driver);
		cart.Click_on_AddtoCart();
		cart.Click_on_Cart();
	}

	@Test(priority = 3)
	public void Check_out() throws InterruptedException {
		Checkout co = new Checkout(driver);
		Thread.sleep(3000);
		co.Clickon_Checkout();
		co.Enter_FirstName();
		co.Enter_LastName();
		co.Enter_Zipcode();
		co.ClickOn_Continue();
		co.ClickOn_Finish();
		WebElement text = driver.findElement(By.xpath("//div[@id='checkout_complete_container']"));
		System.out.println("--------------" + text.getText() + "--------------");
		Thread.sleep(3000);

	}

	@AfterClass
	public void tear_down() {
		driver.quit();
	}

}
