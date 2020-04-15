package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WrapperEx
{
	protected WebDriver driver;

	public void Launchapp(String Browser, String url) //Launching the Chrome,firefox,ie Driver path 

	{

		try 
		{

		if (Browser.equalsIgnoreCase("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");//chrome driver

			driver = new ChromeDriver();

		}

		else if(Browser.equalsIgnoreCase("firefox"))
		{

			System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");//firefox driver

			driver = new FirefoxDriver();	

		}

		else if(Browser.equalsIgnoreCase("Internet Explore"))
		{

		System.setProperty("webdriver.ie.driver", "Driver/IEDriverServer.exe");//Internet Explore

		driver = new InternetExplorerDriver();

		}

			driver.manage().window().maximize();//Maximizing the browser 

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // wait and throw the error

			driver.get(url); // Website url

		}

		catch(WebDriverException e)
		{

			System.out.println("Browser Cloud not Launched Please Check");
		}


	}

	

	public void CloseBrowser() throws InterruptedException

	{

		Thread.sleep(3000); // before closing the web site wait for 3 sec

		driver.close();

	}

}



