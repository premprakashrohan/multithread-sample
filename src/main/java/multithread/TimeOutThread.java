package multithread;

public class TimeOutThread {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			 
				System.out.println(Thread.currentThread());
				if(Thread.currentThread().isInterrupted()) {
					System.out.println("Stoping...");
					return;
				}
			
		});
		t1.start();
		t1.wait(11111);
		t1.interrupt();
	}

}
