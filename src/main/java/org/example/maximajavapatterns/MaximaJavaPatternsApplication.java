package org.example.maximajavapatterns;

import org.example.maximajavapatterns.multithreading.MyThread;
import org.example.maximajavapatterns.observer.Publisher;
import org.example.maximajavapatterns.observer.Subscriber;
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
//		CachedDataSource source = new CachedDataSource("Данные");
//		//Здесь нет задержки
//		System.out.println(source.getData());
//		source.setData("Другие данные");
//		//Здесь задержка
//		System.out.println(source.getData());
//		//Здесь нет задержки
//		System.out.println(source.getData());

		/*Publisher publisher = new Publisher("Publisher #1","Payload");
		Subscriber subscriber1 = new Subscriber("Subscriber #1");
		Subscriber subscriber2 = new Subscriber("Subscriber #2");

		publisher.addSubscriber(subscriber1);
		publisher.addSubscriber(subscriber2);
		publisher.setData("New payload");*/

		MyThread myThread = new MyThread();
		Thread second = new Thread(myThread);
		second.start();

		MyThread.doJob(1000);

		second.join();
		System.out.println("Все потоки завершены");
	}
}
