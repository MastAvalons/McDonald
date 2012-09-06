package com.test.mcdonald;

public class Table {
	public static final int MAX_DISH_COUNT=10;
	private int dishCount;
	
	Table(){
		this.dishCount=0;
	}
	
	void getDish(){
		this.dishCount -= 1;
	}
	void addDish(){
		this.dishCount += 1;
	}
	
	int getDishCount(){
		return this.dishCount;
	}
	
}
