package com.pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Page 
{
	WebDriver driver;                            

	By Whalewatching=By.linkText("whale watching tour"); //Getting by link Text

	By Menu =By.xpath("//*[@id=\"rciHeaderOpenSidenav\"]/div"); //getting By Classname

	By Cruise=By.linkText("Plan A Cruise"); // Getting By link text

	By Close =By.xpath("//*[@id=\"rciHeaderCloseSidenav\"]/div"); //Getting By classname

	By Ships= By.linkText("SHIPS");// Getting By link text

	By Rhapsoday=By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[6]/div/section/div/div[16]/a/div"); //Locator value change every refresh so using full xpath

	By Deck =By.linkText("DECK PLANS");// Getting By link text

	By Dropdown= By.id("deckDropdown"); // Getting By id

	By Royal=By.xpath("//*[@id=\"deck-plans-template\"]/section/section[2]/section[1]/div[2]/section[5]/h4");//Getting Royal Suite Text by Xpath 

	

	public Page(WebDriver driver)

	{

		this.driver=driver;

	}

	

	public int Presencelink() // Checking the "whale watching tour" link is Present if is Present its return 1; else 0

	{

		List<WebElement> link = driver.findElements(Whalewatching);

		int a=link.size(); // Storing 1 in the a int

		System.out.println("Checking Whale Watching link is Persent or not if is Persent return 1 else 0 :" +link.size()); // its return 1

		return a; // return a to use with assert of royal suite present if both present its return true; else its fail

	}

	

	public void Alaska() throws InterruptedException

	{

		driver.findElement(Menu).click();

		Thread.sleep(2000);

		driver.findElement(Cruise).click();

		Thread.sleep(2000);

		driver.findElement(Close).click();

		Thread.sleep(2000);

		driver.findElement(Ships).click();

		Thread.sleep(3000);

		driver.findElement(Rhapsoday).click();

		driver.findElement(Deck).click();

		Thread.sleep(3000);

		Select se = new Select(driver.findElement(Dropdown)); // selecting "Deck Eight" using DropDown

		se.selectByValue("BR");

	}

	

	public String RoyalSuite() // Checking Whether Royalsuite Persent or not and returning to the asserts

	{

		String a=driver.findElement(Royal).getText();

									//Getting the the royal suite text using gettext method and storing in String a 

		String roy=a.substring(0,11); 

									// After getting the text getting the letter using substring for particular word Royal Suite

		System.out.println("Checking Presence of Royal Suite 	:"+roy);

									// Printing the royal suite 

		return	roy;  // returning the getting string to the asserts for checking

	}

}
