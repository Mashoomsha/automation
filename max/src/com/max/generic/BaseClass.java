package com.max.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver;
    public void openBrowser() {
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	driver.get("https://localhost/login.com");
    }
    public void login() {
    	driver.findElement(By.id("username")).sendKeys("admin");
    	driver.findElement(By.name("pwd")).sendKeys("manager");
    	driver.findElement(By.xpath("//div[text()='Login ']")).click();
    }
    public void logout() {
    	driver.findElement(By.id("logoutLink")).click();
    }
    public void closeBrowser() {
    	driver.manage().window().maximize();
    	driver.quit();
    }
}
