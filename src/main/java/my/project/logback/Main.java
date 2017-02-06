package my.project.logback;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zaychick-pavel on 2/6/17.
 */
public class Main {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		int count = 1;
		while (count <= 10) {
			SimpleThread simpleThread = new SimpleThread("thread-" + count);
			executor.execute(simpleThread);
			count++;
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}
}
