package com.test.mcdonald;

public class Cook implements Runnable {
	Thread runner;
	Table cooksTable;

	public Cook(String threadName, Table pCooksTable) {
		this.cooksTable = pCooksTable;
		this.runner = new Thread(this, threadName); // Create a new thread.
		System.out.println(runner.getName());
		runner.start(); // Start the thread.
	}

	public void run() {
		// Display info about this particular thread
		System.out.println(Thread.currentThread());
		while (cooksTable.getDishCount() < Table.MAX_DISH_COUNT) {
			cooksTable.addDish();
			System.out.print(runner.getName()+cooksTable.getDishCount());
		}
		if (cooksTable.getDishCount() == Table.MAX_DISH_COUNT)
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}