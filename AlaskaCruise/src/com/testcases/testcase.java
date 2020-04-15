package com.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.WrapperEx;
import com.pages.Page;

public class testcase extends WrapperEx
{
	@BeforeClass	

	public void launchingChrome()

	{

		Launchapp("chrome","https://www.royalcaribbean.com/alaska-cruises"); // Launching the Chrome and url

	}

@Test

public void Royalcaribbean() throws InterruptedException, IOException

{

	Page ca=new Page(driver);  

	int b=ca.Presencelink(); 

	ca.Alaska();				

	String a=ca.RoyalSuite(); 	// getting the returning value of "RoyalSuite" 

	if(a.equals("Royal Suite") && b==1) //Checking the condition if "whale watching" link AND "Royal Suite" are present Assert is pass else return fail;

	{

		Assert.assertTrue(true);	// If both are present its return true;

	}

	else 

	{

		Assert.assertTrue(false);	// Else Its returns fail 

		System.out.println("Does not meet my requirements");// print the Statement 

	}

}

@AfterClass

public void close() throws InterruptedException

	{

	CloseBrowser(); // Closing the Chrome Browser

	}
}
