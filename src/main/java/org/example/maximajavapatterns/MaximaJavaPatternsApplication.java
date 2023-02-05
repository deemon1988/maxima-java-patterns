package org.example.maximajavapatterns;

import org.example.maximajavapatterns.proxy.CachedDataSource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MaximaJavaPatternsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MaximaJavaPatternsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Старт");
		CachedDataSource source = new CachedDataSource("Данные");
		//Здесь нет задержки
		System.out.println(source.getData());
		source.setData("Другие данные");
		//Здесь задержка
		System.out.println(source.getData());
		//Здесь нет задержки
		System.out.println(source.getData());
	}
}
