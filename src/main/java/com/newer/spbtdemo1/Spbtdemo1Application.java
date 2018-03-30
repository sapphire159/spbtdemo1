package com.newer.spbtdemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.newer.spbtdemo1.mapper")
public class Spbtdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Spbtdemo1Application.class, args);
	}
}
