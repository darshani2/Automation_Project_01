package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // invoke the browser
		
	   driver.get("https://www.saucedemo.com/");
		
	   driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
	    
	   driver.findElement(By.id("login_credentials")).click();
	       
	   driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
	       
	   driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
	       
	   driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
	       
	   driver.findElement(By.cssSelector(".login_password")).click();
	       
	   driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
	       
	   driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
	       
	   driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
	       
	   driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
	       
	   driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-backpack\"]")).click();
	       
	   driver.findElement(By.cssSelector(".select_container")).click();
	       
	   driver.findElement(By.id("react-burger-menu-btn")).click();
	       
	   driver.findElement(By.id("react-burger-cross-btn")).click();
	       
	   driver.findElement(By.linkText("2")).click();
	       
	   driver.findElement(By.cssSelector("*[data-test=\"checkout\"]")).click();
	       
	   driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).click();
	       
	   driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).sendKeys("Aruni");
	       
	   driver.findElement(By.cssSelector("*[data-test=\"lastName\"]")).click();
	       
	   driver.findElement(By.cssSelector("*[data-test=\"lastName\"]")).sendKeys("Sandunika");
	       
	   driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]")).click();
	       
	   driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]")).sendKeys("80441");
	       
	   driver.findElement(By.cssSelector("*[data-test=\"continue\"]")).click();
	       
	   driver.findElement(By.cssSelector("*[data-test=\"finish\"]")).click();
	    
	}

}
