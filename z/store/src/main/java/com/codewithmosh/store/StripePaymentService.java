package com.codewithmosh.store;

import org.springframework.stereotype.Component;

public class StripePaymentService implements PaymentServiceInterface {
  @Override
  public void processPayment(double amount) {
    System.out.println("STRIPE");
    System.out.println(amount);
  }
}
