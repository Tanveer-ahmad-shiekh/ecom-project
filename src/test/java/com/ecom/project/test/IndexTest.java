package com.ecom.project.test; 



import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecom.page.titles.PageTitles;
import com.ecom.project.base.SetUp;
import com.ecom.project.pages.Index;

public class IndexTest extends SetUp {
	Index obj1;     //availible for all , null
	
	IndexTest() {
		intilization();      //    open chrome and url 
		obj1=new Index();
	}
  //IndexTest obj=new IndexTest();
	
	@Test(priority=1)
	public void checkCurrency()                // 1. constructor --> readConfigFile 
	{  
         
      obj1.changeCurrency();

	}
	@Test(priority=2)
	public void verifySiteMapPage()
	{
		obj1.checkSiteMapPage();	
		Assert.assertEquals(PageTitles.SITE_MAP,driver.getTitle());
	}
	
	@Test(priority=3)
	public void verifyShipAndReturnsPage()
	{
		obj1.clickOnShipAndReturn();
		Assert.assertEquals(PageTitles.SHIP_RETURNS,driver.getTitle());
	}
	
	

}
