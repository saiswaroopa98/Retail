
package com.retail.test;

import java.util.ArrayList;
import java.util.List;

import com.retail.discount.PayableAmount;
import com.retail.pojo.Customer;
import com.retail.pojo.Item;
import com.retail.enums.CustomerType;
import com.retail.enums.ItemType;

public class TestRetail {

	public static void main(String[] args) {

		Customer customer = new Customer();

		customer.setCustomerType(CustomerType.EMPLOYEE);

		List<Item> itemsList = new ArrayList<>();

//item1
		Item item1 = new Item();
		item1.setItemType(ItemType.OTHERS);
		item1.setItemValue(2000);
		item1.setItemName("table");
		itemsList.add(item1);

		Item item2 = new Item();
		item2.setItemType(ItemType.OTHERS);
		item2.setItemValue(3000);
		item2.setItemName("dresses");
		itemsList.add(item2);

		Item item3 = new Item();
		item3.setItemType(ItemType.GROCERIES);
		item3.setItemValue(1000);
		item3.setItemName("dhal");
		itemsList.add(item3);

		Item item4 = new Item();
		item4.setItemType(ItemType.GROCERIES);
		item4.setItemValue(1000);
		item4.setItemName("spices");

		itemsList.add(item4);

//other -5000 groceries 2000
// 5000 * 0.3 + 2000
//5000- 1500 + 2000 = 5500
		PayableAmount amountCalculator = new PayableAmount();

		float totalPayableAmount = amountCalculator.getPayableAmount(customer, itemsList);

		System.out.println(totalPayableAmount);
	}

}