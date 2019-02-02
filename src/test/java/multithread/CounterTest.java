package multithread;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;

@RunWith(ConcurrentTestRunner.class)
public class CounterTest {

	private Counter counter = new Counter();

	@Test
	public void addOne() {
		counter.addOne();
	}

	@After
	public void testCount() {
		assertEquals( 4, counter,"4 Threads running addOne in parallel should lead to 4");
	}

}
