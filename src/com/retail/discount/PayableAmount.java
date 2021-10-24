
package com.retail.discount;

import java.util.List;

import com.retail.enums.CustomerType;
import com.retail.enums.ItemType;
import com.retail.pojo.Customer;
import com.retail.pojo.Item;

public class PayableAmount {
	public float getPayableAmount(Customer customer, List<Item> itemsList) {
		float finalAmount = 0;
		if (customer.getCustomerType().equals(CustomerType.EMPLOYEE)) {
			finalAmount = getTotalAmountAfterDiscount(itemsList, 30);
		} else if (customer.getCustomerType().equals(CustomerType.AFFILIATE)) {
			finalAmount = getTotalAmountAfterDiscount(itemsList, 10);
		} else if (customer.getCustomerType().equals(CustomerType.CUSTOMERFROMTWOYEARS)) {
			finalAmount = getTotalAmountAfterDiscount(itemsList, 5);
		} else {
			finalAmount = getTotalAmountAfterDiscount(itemsList);
		}
		return finalAmount;
	}

	public float getTotalAmountAfterDiscount(List<Item> itemsList, int discountPercentage) {
		float sumOfOtherItems = 0;
		float sumOfGroceryItems = 0;
		float total = 0;
		for (Item item : itemsList) {
			if (item.getItemType() != null && item.getItemType().equals(ItemType.GROCERIES)) {
				sumOfGroceryItems += item.getItemValue();
			} else {
				sumOfOtherItems += item.getItemValue();
			}
		}
		total = (sumOfOtherItems - (sumOfOtherItems * discountPercentage) / 100) + sumOfGroceryItems;
		return total;
	}

	public float getTotalAmountAfterDiscount(List<Item> itemsList) {
		float sumOfOtherItems = 0;
		float sumOfGroceryItems = 0;
		float total = 0;
		for (Item item : itemsList) {
			if (item.getItemType() != null && item.getItemType().equals(ItemType.GROCERIES)) {
				sumOfGroceryItems += item.getItemValue();
			} else {
				sumOfOtherItems += item.getItemValue();
			}
		}
		int base = (int) sumOfOtherItems / 100;
		total = (sumOfOtherItems - (5 * base)) + sumOfGroceryItems;
		return total;
	}
}
