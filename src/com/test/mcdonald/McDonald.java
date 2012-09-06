package com.test.mcdonald;

public class McDonald {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Tables for dishes
		Table HamburgerTable=new Table();
		Table CheeseburgerTable=new Table();
		Table MacchikenTable=new Table();
		Table ChippedpotatoTable=new Table();
		Table IcecreamTable=new Table();
		//Cooks
		Cook Cook1=new Cook("cook1",HamburgerTable);
		Cook Cook2=new Cook("cook2",CheeseburgerTable);
		Cook Cook3=new Cook("cook3",MacchikenTable);
		Cook Cook4=new Cook("cook4",ChippedpotatoTable);
		Cook Cook5=new Cook("cook5",IcecreamTable);
		
		
		int count=HamburgerTable.getDishCount();
		System.out.print(count);

	}
	
	
	public enum Menu {
		HAMBURGER, CHEESEBURGER, MACCHICKEN, CHIPPED_POTATO, ICECREAM;  // our dishes
		}

}
