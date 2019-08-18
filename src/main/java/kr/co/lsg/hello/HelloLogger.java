package kr.co.lsg.hello;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloLogger {
	private static final Logger logger = LoggerFactory.getLogger(HelloLogger.class);
	public static void main(String[] args) {
		System.out.println("Hello, Logger at" + new Date());
		logger.info("Hello, Logger. <Logger info>");
		logger.debug("Hello, Logger. <Logger debug>");
		logger.error("Hello, Logger. <Logger error>");

	}

}
