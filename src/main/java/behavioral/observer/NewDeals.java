package com.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class NewDeals extends Observable {
	
	List<String> dealList = new ArrayList<String>();
	
	public boolean addNewDeal(String deal) {
		dealList.add(deal);
        setChanged();
        notifyObservers(deal);
		return true;
	}
	
	public boolean removeDeal(String deal) {
		dealList.remove(deal);
        setChanged();
        notifyObservers(deal);
		return true;
	}
	
}