package com.ada;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_HotelOptions extends TC0_BaseClass{
	
	@When("User to select one of the options listed")
	public void user_to_select_one_of_the_options_listed() {
		driver.findElement(By.id("radiobutton_0")).click();
		
	}
	@When("User should click Continue")
	public void user_should_click_continue() {
		driver.findElement(By.id("continue")).click();
	}
	@Then("User should be directed to Book a hotel page")
	public void user_should_be_directed_to_book_a_hotel_page() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File fullpage = ts.getScreenshotAs(OutputType.FILE);
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String timeStamp = time.toString().replace(" ", "").replace(":","_");
		File f = new File("D:\\eclipse-workspace\\JUnitsFramework\\ScreenShots\\Before"+timeStamp+".png");
		FileUtils.copyFile(fullpage,f);
	}

}
