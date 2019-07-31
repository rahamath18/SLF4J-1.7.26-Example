package com.test.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4J_Example {
	
	private static final Logger logger = LoggerFactory.getLogger(SLF4J_Example.class);

	public static void main(String[] args) {
		logger.trace("slf4j trace...");
		logger.debug("slf4j debug...");
		logger.info("slf4j info...");
		logger.warn("slf4j warn...");
		logger.error("slf4j error...");
		
		try {
			Integer.parseInt("I am not number!");
			//
		} catch (NumberFormatException e) {
			logger.error("ERROR - ", e);
		}
	}

}
