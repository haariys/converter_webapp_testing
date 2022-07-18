package xyz1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import org.junit.*;

public class SeleniumTestCases {

  
  public String [] getArea(String value1)
	{
	String [ ]results= new String[9];
	String value =value1;
	String[] Area = {"Square millimeter","Square centimeter","Square inch","Square foot","Square yard","Square meter","Hectare","Acre","Square mile"};
	System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("file:///C:/Users/haariys/Desktop/Unit-Converter-master/index.html");
	driver.findElement(By.id("first_input_field")).clear();
	Select firstUnit = new Select(driver.findElement(By.id("first_select_element")));
	firstUnit.selectByVisibleText(Area[0]);
	for(int i =0;i<Area.length;i++)
	{
		
	Select secondUnit = new Select(driver.findElement(By.id("second_select_element")));
	secondUnit.selectByVisibleText(Area[i]);
	driver.findElement(By.id("first_input_field")).sendKeys(value);
	String secondUnit_text =driver.findElement(By.id("second_input_field")).getAttribute("value");
	System.out.println("\""+secondUnit_text+"\",");
	driver.findElement(By.id("first_input_field")).clear();
	results[i]=secondUnit_text;
		
	}
	return results;

	}
  //****************************************************************************//
  //				LENGTH 
  //
  //****************************************************************************//
  public String [] getLength(String value1)
 	{System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.navigate().to("file:///C:/Users/haariys/Desktop/Unit-Converter-master/index.html");
	  
	  driver.findElement(By.id("length_button")).click();
	  driver.findElement(By.id("first_input_field")).clear();
 	String [ ]results= new String[9];
 	String value =value1;
 	String[] Length = {"Millimetre","Centimeter","Inch","Decimeter","Foot","Yard","Meter","Kilometer","Mile"};
 	
 //	String[] Time = {"Microseconds","Milliseconds","Seconds","Minutes","Hours","Days","Weeks","Months","Years"};
 	Select firstUnit = new Select(driver.findElement(By.id("first_select_element")));
 	firstUnit.selectByVisibleText(Length[0]);
 	for(int i =0;i<Length.length;i++)
 	{
 		
 	Select secondUnit = new Select(driver.findElement(By.id("second_select_element")));
 	secondUnit.selectByVisibleText(Length[i]);
 	driver.findElement(By.id("first_input_field")).sendKeys(value);
 	String secondUnit_text =driver.findElement(By.id("second_input_field")).getAttribute("value");
 	System.out.println("\""+secondUnit_text+"\",");
 	driver.findElement(By.id("first_input_field")).clear();
 	results[i]=secondUnit_text;
 		
 	}
 	return results;

 	}
  //****************************************************************************//
  //				TIME 
  //
  //****************************************************************************//
  public String [] getTime(String value1)
 	{System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.navigate().to("file:///C:/Users/haariys/Desktop/Unit-Converter-master/index.html");
	 	  driver.findElement(By.id("time_button")).click();
	  driver.findElement(By.id("first_input_field")).clear();
 	String [ ]results= new String[9];
 	String value =value1;
 	
 	String[] Time = {"Microseconds","Milliseconds","Seconds","Minutes","Hours","Days","Weeks","Months","Years"};
 	Select firstUnit = new Select(driver.findElement(By.id("first_select_element")));
 	firstUnit.selectByVisibleText(Time[0]);
 	for(int i =0;i<Time.length;i++)
 	{
 		
 	Select secondUnit = new Select(driver.findElement(By.id("second_select_element")));
 	secondUnit.selectByVisibleText(Time[i]);
 	driver.findElement(By.id("first_input_field")).sendKeys(value);
 	String secondUnit_text =driver.findElement(By.id("second_input_field")).getAttribute("value");
 	System.out.println("\""+secondUnit_text+"\",");
 	driver.findElement(By.id("first_input_field")).clear();
 	results[i]=secondUnit_text;
 		
 	}
 	return results;

 	}
  //****************************************************************************//
  //				ENERGY 
  //
  //****************************************************************************//
  public String [] getEnergy(String value1)
 	{System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.navigate().to("file:///C:/Users/haariys/Desktop/Unit-Converter-master/index.html");
	 
	  driver.findElement(By.id("energy_button")).click();
	  driver.findElement(By.id("first_input_field")).clear();
 	String [ ]results= new String[3];
 	String value =value1;
 	
 	String[] Energy = {"Joule","Kilojoule","Megajoule"};
 	Select firstUnit = new Select(driver.findElement(By.id("first_select_element")));
 	firstUnit.selectByVisibleText(Energy[0]);
 	for(int i =0;i<Energy.length;i++)
 	{
 		
 	Select secondUnit = new Select(driver.findElement(By.id("second_select_element")));
 	secondUnit.selectByVisibleText(Energy[i]);
 	driver.findElement(By.id("first_input_field")).sendKeys(value);
 	String secondUnit_text =driver.findElement(By.id("second_input_field")).getAttribute("value");
 	System.out.println("\""+secondUnit_text+"\",");
 	driver.findElement(By.id("first_input_field")).clear();
 	results[i]=secondUnit_text;
 		
 	}
 	return results;

 	}
  //****************************************************************************//
  //				CURRENCY 
  //
  //****************************************************************************//
  public String [] getCurrency(String value1)
 	{System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.navigate().to("file:///C:/Users/haariys/Desktop/Unit-Converter-master/index.html");
	 
	  driver.findElement(By.id("currency_button")).click();
	  driver.findElement(By.id("first_input_field")).clear();
 	String [ ]results= new String[10];
 	String value =value1;
 	
 	String[] Currency = {"JPY(Japanese Yen)","INR(Indian Rupee)","MXN(Mexican Peso)","CNY(Chinese Yuan)","CAD(Canadian Dollar)","AUD(Australian Dollar)","USD(United States Dollar)","CHF(Swiss Franc)","EUR(Euro)","GBP(British Pound Sterling)"};
 	Select firstUnit = new Select(driver.findElement(By.id("first_select_element")));
 	firstUnit.selectByVisibleText(Currency[0]);
 	for(int i =0;i<Currency.length;i++)
 	{
 		
 	Select secondUnit = new Select(driver.findElement(By.id("second_select_element")));
 	secondUnit.selectByVisibleText(Currency[i]);
 	driver.findElement(By.id("first_input_field")).sendKeys(value);
 	String secondUnit_text =driver.findElement(By.id("second_input_field")).getAttribute("value");
 	System.out.println("\""+secondUnit_text+"\",");
 	driver.findElement(By.id("first_input_field")).clear();
 	results[i]=secondUnit_text;
 		
 	}
 	return results;

 	}
  //****************************************************************************//
  //				BIT 
  //
  //****************************************************************************//
  public String [] getBit(String value1)
 	{System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.navigate().to("file:///C:/Users/haariys/Desktop/Unit-Converter-master/index.html");
	 
	  driver.findElement(By.id("bits_bytes_button")).click();
	  driver.findElement(By.id("first_input_field")).clear();
 	String [ ]results= new String[9];
 	String value =value1;
 	
 	String[] Bits = {"Bits","Bytes","Kilobits","Kilobytes","Megabits","Megabytes","Gigabits","Gigabytes","Terabytes"};
 	Select firstUnit = new Select(driver.findElement(By.id("first_select_element")));
 	firstUnit.selectByVisibleText(Bits[0]);
 	for(int i =0;i<Bits.length;i++)
 	{
 		
 	Select secondUnit = new Select(driver.findElement(By.id("second_select_element")));
 	secondUnit.selectByVisibleText(Bits[i]);
 	driver.findElement(By.id("first_input_field")).sendKeys(value);
 	String secondUnit_text =driver.findElement(By.id("second_input_field")).getAttribute("value");
 	System.out.println("\""+secondUnit_text+"\",");
 	driver.findElement(By.id("first_input_field")).clear();
 	results[i]=secondUnit_text;
 		
 	}
 	return results;

 	}
  //****************************************************************************//
  //				WEIGHT 
  //
  //****************************************************************************//
  public String [] getWeight(String value1)
 	{System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.navigate().to("file:///C:/Users/haariys/Desktop/Unit-Converter-master/index.html");
	 
	  driver.findElement(By.id("weight_button")).click();
	  driver.findElement(By.id("first_input_field")).clear();
 	String [ ]results= new String[8];
 	String value =value1;
 	
 	String[] Weight = {"Milligrams","Carats","Grams","Ounces","Pounds","Kilograms","Tons","Kilotons"};
 	Select firstUnit = new Select(driver.findElement(By.id("first_select_element")));
 	firstUnit.selectByVisibleText(Weight[0]);
 	for(int i =0;i<Weight.length;i++)
 	{
 		
 	Select secondUnit = new Select(driver.findElement(By.id("second_select_element")));
 	secondUnit.selectByVisibleText(Weight[i]);
 	driver.findElement(By.id("first_input_field")).sendKeys(value);
 	String secondUnit_text =driver.findElement(By.id("second_input_field")).getAttribute("value");
 	System.out.println("\""+secondUnit_text+"\",");
 	driver.findElement(By.id("first_input_field")).clear();
 	results[i]=secondUnit_text;
 		
 	}
 	return results;

 	}
  //****************************************************************************//
  //				VOLUME 
  //
  //****************************************************************************//
  public String [] getVolume(String value1)
 	{System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.navigate().to("file:///C:/Users/haariys/Desktop/Unit-Converter-master/index.html");
	 
	  driver.findElement(By.id("volume_button")).click();
	  driver.findElement(By.id("first_input_field")).clear();
 	String [ ]results= new String[9];
 	String value =value1;
 	
 	String[] Volume = {"Cubic Centimeter","Milliliter","Cup","Pint","Liter","Gallon","Barrel","Cubic Meter","Cubic Kilometer"};
 	Select firstUnit = new Select(driver.findElement(By.id("first_select_element")));
 	firstUnit.selectByVisibleText(Volume[0]);
 	for(int i =0;i<Volume.length;i++)
 	{
 		
 	Select secondUnit = new Select(driver.findElement(By.id("second_select_element")));
 	secondUnit.selectByVisibleText(Volume[i]);
 	driver.findElement(By.id("first_input_field")).sendKeys(value);
 	String secondUnit_text =driver.findElement(By.id("second_input_field")).getAttribute("value");
 	System.out.println("\""+secondUnit_text+"\",");
 	driver.findElement(By.id("first_input_field")).clear();
 	results[i]=secondUnit_text;
 		
 	}
 	return results;

 	}
}
