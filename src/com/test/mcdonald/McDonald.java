package com.test.mcdonald;

public class McDonald {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Table HamburgerTable=new Table();
		Table CheeseburgerTable=new Table();
		Table MacchikenTable=new Table();
		Table ChippedpotatoTable=new Table();
		Table IcecreamTable=new Table();
		
		int count=HamburgerTable.getDishCount();
		System.out.print(count);

	}
	
	
	public enum Menu {
		HAMBURGER, CHEESEBURGER, MACCHICKEN, CHIPPED_POTATO, ICECREAM;  // our dishes
		}

}
