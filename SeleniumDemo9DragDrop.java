package com.selenium;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDemo9DragDrop {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CDAC\\Desktop\\Selenium Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement drag=obj.findElement(By.xpath("//*[@id=\"fourth\"]/a"));

		WebElement drop=obj.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		
		WebElement drag2=obj.findElement(By.xpath("//*[@id=\"fourth\"]/a"));

		WebElement drop2=obj.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	
		Actions act=new Actions(obj); 
		act.dragAndDrop(drag, drop).build().perform();
		
		Actions act2=new Actions(obj); 
		act.dragAndDrop(drag2, drop2).build().perform();
		
	}

}
