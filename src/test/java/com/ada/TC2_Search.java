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

public class TC2_Search extends TC0_BaseClass{
	


	@When("User should choose a location from the drop drown menu")
	public void user_should_choose_a_location_from_the_drop_drown_menu() {
		WebElement location = driver.findElement(By.id("location"));
		Select l = new Select(location);
		l.selectByVisibleText("London");
	}
	
	
	
	@When("User can choose a hotel from the drop drown menu")
	public void user_can_choose_a_hotel_from_the_drop_drown_menu() {
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select hotels = new Select(hotel);
		hotels.selectByVisibleText("Hotel Creek");
	}
	
		
	@When("User can choose a room type from the drop drown menu")
	public void user_can_choose_a_room_type_from_the_drop_drown_menu() {
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select type = new Select(roomtype);
		type.selectByVisibleText("Standard");
	}
	
	
	@When("User should choose number of rooms from the drop drown menu")
	public void user_should_choose_number_of_rooms_from_the_drop_drown_menu() {
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select room = new Select(roomno);
		room.selectByVisibleText("1 - One");
	}
	
	
	@When("User should choose Check-in date")
	public void user_should_choose_check_in_date() {
		driver.findElement(By.id("datepick_in")).sendKeys("21/04/2024");
	}
	@When("Uder should choose Check-out date")
	public void uder_should_choose_check_out_date() {
		driver.findElement(By.id("datepick_out")).sendKeys("25/04/2024");
	}
	
	
	@When("User should choose adults-per-room from the drop drown menu")
	public void user_should_choose_adults_per_room_from_the_drop_drown_menu() {
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select aroom = new Select(adultroom);
		aroom.selectByVisibleText("1 - One");
	}
	
	
	@When("User can choose children-per-room from the drop drown menu")
	public void user_can_choose_children_per_room_from_the_drop_drown_menu() {
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select croom = new Select(childroom);
		croom.selectByVisibleText("1 - One");
	}
	
	
	@When("User should enter the search button")
	public void user_should_enter_the_search_button() {
		driver.findElement(By.id("Submit")).click();
	}
	
	
	@Then("User should be directed to a page that displays the various hotels\\/rooms that are available for the user to book")
	public void user_should_be_directed_to_a_page_that_displays_the_various_hotels_rooms_that_are_available_for_the_user_to_book() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File fullpage = ts.getScreenshotAs(OutputType.FILE);
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String timeStamp = time.toString().replace(" ", "").replace(":","_");
		File f = new File("D:\\eclipse-workspace\\JUnitsFramework\\ScreenShots\\Before"+timeStamp+".png");
		FileUtils.copyFile(fullpage,f);
	}






}
