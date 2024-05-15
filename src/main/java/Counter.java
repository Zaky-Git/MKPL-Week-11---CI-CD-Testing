package src.main.java;

public class Counter {

	private int count;

	public Counter() {
		this.reset();
	}

	public void reset() {
		count = 10;
	}

	public void increment() {
		count = count + 4;
	}

	public void decrement() {
		count--;
	}

	public int getCount() {
		return count;
	}

}
