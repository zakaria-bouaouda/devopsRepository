package ma.ginfo.bouaouda;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoDevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDevOpsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner console() {
		return args -> {
			System.out.println("Hello world");
		 
		};	
}}

