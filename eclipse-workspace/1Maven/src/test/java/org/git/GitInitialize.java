package org.git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitInitialize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("MadhanYvw");
		driver.findElement(By.id("password")).sendKeys("393462");
		driver.findElement(By.id("login")).click();
		
	

	}



	}


