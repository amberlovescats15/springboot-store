package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
  private PaymentServiceInterface paymentService;

  // if  have more than one contructor then use @Autowire
  public OrderService(PaymentServiceInterface paymentService) {
    this.paymentService = paymentService;
  }
  public void placeOrder() {
    paymentService.processPayment(10);
  }
}
