package com.codewithmosh.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(StoreApplication.class, args);
		applicationContext.getBean(OrderService.class);

//		SpringApplication.run(StoreApplication.class, args);
		var orderService = new OrderService(
						new StripePaymentService()
		);
		orderService.placeOrder();

		var second = new OrderService(
						new PayPalPaymentService()
		);
		second.placeOrder();
	}
}
