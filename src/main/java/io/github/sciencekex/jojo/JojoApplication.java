package io.github.sciencekex.jojo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.github.sciencekex.jojo.mapper")
public class JojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JojoApplication.class, args);
	}

}
