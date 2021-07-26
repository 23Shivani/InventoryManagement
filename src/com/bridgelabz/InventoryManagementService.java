package com.bridgelabz;

public interface InventoryManagementService {
	
	public void addInventoryItem(Items item);
	public void getInventoryDetails();
	public void getInventoryDataByName(String itemName);
	public void calculateInventoryItemValue();
	
}
