package com.kafka.paymentservice.recource;

import com.kafka.paymentservice.model.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

public interface PaymentResource {

    @PostMapping
    ResponseEntity<Payment> payment(@RequestBody Payment payment);
}
