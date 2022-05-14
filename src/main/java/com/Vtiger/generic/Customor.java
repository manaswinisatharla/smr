package com.Vtiger.generic;

import org.testng.annotations.Test;

public class Customor {
	@Test
	public void createcustomersTest(){
		System.out.println("create customer");
		int[] arr={1,2,3};
		System.out.println(arr[5]);

	}
	@Test(dependsOnMethods ="createcustomersTest")
	public void modifyCustomerTest() {
		System.out.println("modify customer");
		

	}
	@Test(dependsOnMethods ="modifyCustomerTest")
	public void deleteCustomerTest() {
		System.out.println("delete customer");
		

	}
	

}
