package com.jiwoo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebProjectTestApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringBootExam1Application.class, args);
		SpringApplication application = new SpringApplication(WebProjectTestApplication.class);
		// 필요한 환경 설정 코드에서 직접을 한다..
		application.setWebApplicationType(WebApplicationType.SERVLET);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
		// 프로퍼티스 파일에 환경 설정을 한다. <= 우선권을 갖는다
		
		LoggingRunner lr = new LoggingRunner();
	      try {
	         lr.run(null);
	      } catch (Exception e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	}
	
}
