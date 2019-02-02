package multithread;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;
@RunWith(ConcurrentTestRunner.class)

public class ConcurrencyVSParallelismTest {
	ConcurrencyVSParallelism cvp = null;
	@BeforeEach
	void setUp() throws Exception {
		cvp = new ConcurrencyVSParallelism();
	}

	@Test
	void testMain() throws InterruptedException {
		ConcurrencyVSParallelism.main(null);
	}

	@Test
	void testThreadExample1() throws InterruptedException {
		cvp.threadExample1();
	}

	@Test
	void testThreadExample2() {
		cvp.threadExample2();
	}

}
