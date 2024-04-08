package com.ada;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookHotel extends TC0_BaseClass {
	
	@When("User should enter First name")
	public void user_should_enter_first_name() {
		driver.findElement(By.id("first_name")).sendKeys("Sharmee");
		
	}
	@When("User should enter Last name")
	public void user_should_enter_last_name() {
		driver.findElement(By.id("last_name")).sendKeys("Deepak");
		
	}
	@When("User should enter Billing Address")
	public void user_should_enter_billing_address() {
		driver.findElement(By.id("address")).sendKeys("Vivekanandar theru");
	
	}
	@When("User should enter Credit card number")
	public void user_should_enter_credit_card_number() {
	driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
		
		WebElement CCType = driver.findElement(By.id("cc_type"));
		Select cardtype = new Select(CCType);
		cardtype.selectByVisibleText("VISA");
		
		
	}
	@When("User should choose Expiry date month and year from the drop down menus")
	public void user_should_choose_expiry_date_month_and_year_from_the_drop_down_menus() {
		WebElement expiryDate = driver.findElement(By.id("cc_exp_month"));
		Select exDate = new Select(expiryDate);
		exDate.selectByVisibleText("April");
		
		WebElement expiryYear = driver.findElement(By.id("cc_exp_year"));
		Select exYear = new Select(expiryYear);
		exYear.selectByVisibleText("2028");

		
	}
	@When("User should enter CVV number")
	public void user_should_enter_cvv_number() {
		driver.findElement(By.id("cc_cvv")).sendKeys("244");
		
	}
	@When("User should click Book Now button")
	public void user_should_click_book_now_button() {
		driver.findElement(By.id("book_now")).click();
	}
	@Then("User should be directed to a page with the booking confirmation")
	public void user_should_be_directed_to_a_page_with_the_booking_confirmation() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File fullpage = ts.getScreenshotAs(OutputType.FILE);
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String timeStamp = time.toString().replace(" ", "").replace(":","_");
		File f = new File("D:\\eclipse-workspace\\JUnitsFramework\\ScreenShots\\Before"+timeStamp+".png");
		FileUtils.copyFile(fullpage,f);
	}


}
