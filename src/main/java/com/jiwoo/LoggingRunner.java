package com.jiwoo;

import org.springframework.boot.ApplicationArguments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;

public class LoggingRunner implements ApplicationRunner{
	private Logger logger = LoggerFactory.getLogger(LoggingRunner.class);
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		// TODO Auto-generated method stub
		logger.trace("이 내용은 로그입니다. trace레벨의.....");
		logger.debug("이 내용은 로그입니다. debug레벨의.....");
		logger.info("이 내용은 로그입니다. info레벨의.....");
		logger.warn("이 내용은 로그입니다. warn레벨의.....");
		logger.error("이 내용은 로그입니다. error레벨의.....");
	}
}
