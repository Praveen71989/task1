package com.stepdefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginStep {
//WebDriver driver;
//	@Given("User is on the Adactin hotel page")
//	public void a () {
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.get("https://www.adactinhotelapp.com/");
//		driver.manage().window().maximize();
//		//driver.manage().timeouts().implicitlyWaits(Duration.ofSeconds(15));
//	}
//	@When("User should enter username and password")
//	public void b() {
//	WebElement txtusername = driver.findElement(By.id("username"));
//	txtusername.sendKeys("greens8767");
//	WebElement txtpassword = driver.findElement(By.id("password"));
//	txtpassword.sendKeys("L4R739");
//	}
//	
//	@When("User should click login button")
//	public void c() {
//	WebElement btnLogin = driver.findElement(By.id("login"));
//	btnLogin.click();
//	}
//	@Then("User should verify after login success msg")
//	public void d() {
//	WebElement txtverify = driver.findElement(By.xpath("(//td[@class='welcome_menu'])[1]"));
//	String data = txtverify.getText();
//	Assert.assertEquals("Verify Login Success Msg", "Welcome to Adactin Group of Hotels", data);
//	driver.quit();
//	}

WebDriver driver;
	@Given("User is on the Adactin hotel page")
	public void a() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	@When("User should login {string}, {string}")
	public void b(String username, String password) {
	WebElement txtusername = driver.findElement(By.id("username"));
	txtusername.sendKeys(username);
	WebElement txtpassword = driver.findElement(By.id("password"));
	txtpassword.sendKeys(password);
	WebElement btnLogin = driver.findElement(By.id("login"));
	btnLogin.click();
	}
	@When("User should SearchHotel {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void c(String location, String hotels, String roomType, String NoOfRooms, String checkInDate, String checkOutdate, String AdultPerRoom, String ChildrenPerRoom) {
		WebElement locator = driver.findElement(By.id("location"));
		Select select = new Select(locator);
		select.selectByVisibleText(location);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select select1 = new Select(hotel);
		select1.selectByVisibleText(hotels);
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select select2 = new Select(room);
		select2.selectByVisibleText(roomType);
		
		WebElement roomno = driver.findElement(By.name("room_nos"));
	    Select select3 = new Select(roomno);
	    select3.selectByVisibleText(NoOfRooms);
		
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys("checkInDate");
		
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys("checkOutDate");
		
		WebElement adults = driver.findElement(By.id("adult_room"));
		Select select6 = new Select(adults);
		select6.selectByVisibleText(AdultPerRoom);
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select select7 = new Select(child);
		select7.selectByVisibleText(ChildrenPerRoom);
		
		WebElement findElement = driver.findElement(By.id("Submit"));
		findElement.click();
	
	}
	@When("User should SelectHotel")
	public void d() {
		WebElement bTnRadio = driver.findElement(By.id("radiobutton_0"));
		bTnRadio.click();
		
		WebElement BtnClick = driver.findElement(By.id("continue"));
		BtnClick.click();
	}

	@When("User should BookHotel {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void e(String firstName, String lastName, String address, String CCNo, String CCType, String CCMonth, String CCYear, String CVVNo) throws InterruptedException {

		WebElement txtFirstname = driver.findElement(By.id("first_name"));
		txtFirstname.sendKeys(firstName);
		
		WebElement txtLastname = driver.findElement(By.id("last_name"));
		txtLastname.sendKeys(lastName);
		
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys(address);
		
		WebElement txtCcnumber = driver.findElement(By.id("cc_num"));
		txtCcnumber.sendKeys(CCNo);
		
		WebElement dDncctype = driver.findElement(By.id("cc_type"));
		Select select = new Select(dDncctype);
		select.selectByVisibleText(CCType);
		
		WebElement dDnccexpmonth = driver.findElement(By.id("cc_exp_month"));
		Select select2 = new Select(dDnccexpmonth);
		select2.selectByVisibleText(CCMonth);
		
		WebElement dDnccexpyear = driver.findElement(By.id("cc_exp_year"));
		Select select3 = new Select(dDnccexpyear);	
		select3.selectByVisibleText(CCYear);
		
		WebElement txtCccvv = driver.findElement(By.id("cc_cvv"));
		txtCccvv.sendKeys(CCNo);
		
		WebElement bTnbooknow = driver.findElement(By.id("book_now"));
		bTnbooknow.click();
	}
	
	@Then("User Should print OrderId")
	public void f() throws InterruptedException {
		Thread.sleep(10000);
		WebElement orderno = driver.findElement(By.id("order_no"));
		String attribute = orderno.getAttribute("value");
		System.out.println(attribute);
		driver.quit();
	}




}
