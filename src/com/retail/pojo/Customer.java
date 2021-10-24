package com.retail.pojo;

import com.retail.enums.CustomerType;

public class Customer {

	private CustomerType customerType;

	private int customerId;

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

}
