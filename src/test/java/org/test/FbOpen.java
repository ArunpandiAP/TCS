package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbOpen {
	public static void main (String []arges) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\javaproject\\MavenClass\\Driver\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtEmail=driver.findElement(By.id("email"));txtEmail.sendKeys("arun@gmail.com");
		WebElement txtPass=driver.findElement(By.id("pass"));txtPass.sendKeys("12345678");
		WebElement btnClick=driver.findElement(By.name("login"));btnClick.click();
				
	}

}
