package com.ecom.project.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dd {

	public static void selectByVtest(WebElement ele,String text)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
	public static void selectDayByIndex(WebElement BirthDay)
	{
		Select sel = new Select(BirthDay);
		sel.selectByIndex(3);
	}
	public static void selectMonthByIndex(WebElement BirthMonth)
	{
		Select sel = new Select(BirthMonth);
		sel.selectByIndex(12);
	}
	public static void selectYearByVtest(WebElement BirthYear, String text)
	{
		Select sel=new Select(BirthYear);
		sel.selectByVisibleText(text);
	}
}
