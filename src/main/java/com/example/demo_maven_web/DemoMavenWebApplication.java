package com.example.demo_maven_web;


import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@SpringBootApplication
public class DemoMavenWebApplication {

	public static void main(String[] args) {


		SpringApplication.run(DemoMavenWebApplication.class, args);


		//SpringApplication app = new SpringApplication(DemoMavenWebApplication.class);
		//app.setBannerMode(Banner.Mode.OFF);
		//app.run(args);

		//아래는 실행 안됨
//		new SpringApplicationBuilder()
//				.sources(SpringinitApplication.class)
//				//.main(SpringApplication.class)
//				.run(args);


	}

}
