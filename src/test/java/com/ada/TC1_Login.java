package com.ada;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_Login extends TC0_BaseClass {
	

	@Given("User should enter the Adactin website")
	public void user_should_enter_the_adactin_website() {
		browserSetup("https://adactinhotelapp.com/");
	}
	
	
	@When("User should enter the Username and password")
	public void user_should_enter_the_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("SharmeeDeep123");
		driver.findElement(By.id("password")).sendKeys("Qwerty@123");
	}
	
	
	
	@When("User should enter the login button")
	public void user_should_enter_the_login_button() {
		driver.findElement(By.id("login")).click();
	}
	
	
	
	@Then("User should be able to login and directed to the search hotel page")
	public void user_should_be_able_to_login_and_directed_to_the_search_hotel_page() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File fullpage = ts.getScreenshotAs(OutputType.FILE);
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String timeStamp = time.toString().replace(" ", "").replace(":","_");
		File f = new File("D:\\eclipse-workspace\\JUnitsFramework\\ScreenShots\\Before"+timeStamp+".png");
		FileUtils.copyFile(fullpage,f);
	}


}
