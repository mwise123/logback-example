package my.project.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * Created by zaychick-pavel on 2/6/17.
 */
public class SimpleThread implements Runnable {
	static Logger logger = LoggerFactory.getLogger(SimpleThread.class);

	private String name;

	public SimpleThread(String name) {
		this.name = name;
	}

	public void run() {
		MDC.put("logFileName", name);
		logger.debug(name);
		MDC.remove("logFileName");
	}
}
