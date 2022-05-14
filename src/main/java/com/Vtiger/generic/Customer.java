package com.Vtiger.generic;

import org.testng.annotations.Test;

public class Customer {
	@Test(groups ={"st,rt"})
	public void createCustomerTest() {
		System.out.println("Create customer");
	}
	
	@Test(priority = 2)
	public void ModifyCustomerTest() {
		System.out.println("Modify customer");
	}
	@Test(priority = 1)
	public void deleteCustomerTest() {
		System.out.println("delete customer");
	}
	
		
	}

