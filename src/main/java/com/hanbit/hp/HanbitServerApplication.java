package com.hanbit.hp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={
		DataSourceTransactionManagerAutoConfiguration.class,
		DataSourceAutoConfiguration.class
})
public class HanbitServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HanbitServerApplication.class, args);
	}
}
