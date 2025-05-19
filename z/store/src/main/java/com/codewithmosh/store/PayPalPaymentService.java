package com.codewithmosh.store;

import org.springframework.stereotype.Component;

@Component
public class PayPalPaymentService implements PaymentServiceInterface {
  @Override
  public void processPayment(double amount) {
    System.out.println("PAY PAL");
    System.out.println(amount);
  }
}
