package com.Vtiger.generic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest_dataprovider {
	@Test(dataProvider = "bookTicketDataProvider")
	public void bookTicket(String src,String dest) {
		System.out.println("src,dest");
	
	}
	@DataProvider
	public Object[][] bookTicketDataProvider(){
		Object[][] objArr=new Object[5][3];
		objArr[0][0]="Banglore";
		objArr[0][1]="Mysore";
		objArr[1][0]="Banglore";
		objArr[1][1]="Pune";
		objArr[2][0]="Banglore";
		objArr[2][1]="Mangalore";
		objArr[3][0]="Pune";
		objArr[3][1]="Mysore";
		objArr[4][0]="Goa";
		objArr[4][1]="Pune";
		return objArr;

	}

}
