package multithread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyVSParallelism {

	public static void main(String[] args) throws InterruptedException {
		// Parallelism

		ConcurrencyVSParallelism cvp = new ConcurrencyVSParallelism();
		cvp.threadExample1();
		cvp.threadExample2();

	}

	public void threadExample1() throws InterruptedException {
		new Thread(() -> {
			print("T1");

		}).start();
		new Thread(() -> {
			print("T2");

		}).start();
		new Thread(() -> {
			print("T3");
		}).start();
		new Thread(() -> {
			print("T4");
		}).start();
		Thread.sleep(5000);
	}

	public void threadExample2() {
		ExecutorService es = Executors.newFixedThreadPool(4);
		es.submit(() -> {
			while (1 < 3)
				System.out.println("T1 : running....");
		});
		es.submit(() -> {
			while (1 < 3)
				System.out.println("T2 : running....");
		});
		es.submit(() -> {
			while (1 < 3)
				System.out.println("T3 : running....");
		});
		es.submit(() -> {
			while (1 < 3)
				System.out.println("T4 : running....");
		});
	}

	public static void print(String str) {
		while (1 < 3)
			System.out.println(str + " : running....");
	}
}