package multithread;

public class Counter {
	private volatile int count=0;

	public void addOne() {
		count++;
	}

	public int getCount() {
		return count;
	}
}
