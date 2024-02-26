package com.example.argtest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ArgtestApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ArgtestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// 在这里你可以访问命令行参数
		System.out.println(Arrays.toString(args));
	}

}
