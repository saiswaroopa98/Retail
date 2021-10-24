package com.retail.pojo;

import com.retail.enums.ItemType;

public class Item {


private String itemName;

private ItemType itemType;

private float itemValue;

public String getItemName() {
return itemName;
}

public void setItemName(String itemName) {
this.itemName = itemName;
}

public ItemType getItemType() {
return itemType;
}

public void setItemType(ItemType itemType) {
this.itemType = itemType;
}

public double getItemValue() {
return itemValue;
}

public void setItemValue(float itemValue) {
this.itemValue = itemValue;
}



}

