package com.ada;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_BookingConfirmation extends TC0_BaseClass {
	
	@When("User should verify if Order-id is generated")
	public void user_should_verify_if_order_id_is_generated() throws InterruptedException {
		Thread.sleep(5000);
		WebElement table = driver.findElement(By.className("login"));
		WebElement cell = table.findElement(By.id("order_no"));
		String attribute = cell.getAttribute("value");
		System.out.println(attribute);
	}
	@Then("User should close the browser")
	public void user_should_click_logout_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();  
	}
	

}
