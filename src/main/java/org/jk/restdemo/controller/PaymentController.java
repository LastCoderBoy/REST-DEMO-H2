package org.jk.restdemo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jk.restdemo.dto.PaymentRequest;
import org.jk.restdemo.dto.PaymentResponse;
import org.jk.restdemo.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @GetMapping("/{id}")
    public ResponseEntity<PaymentResponse> getPaymentById(@PathVariable Long id) {
        log.info("Fetching payment with ID: {}", id);
        PaymentResponse paymentResponse = paymentService.getPaymentById(id);
        return ResponseEntity.ok(paymentResponse);
    }

    @GetMapping
    public ResponseEntity<List<PaymentResponse>> getAllPayments() {
        log.info("Fetching all payments");
        List<PaymentResponse> payments = paymentService.getAllPayments();
        return ResponseEntity.ok(payments);
    }

    @PostMapping
    public ResponseEntity<PaymentResponse> createPayment(@RequestBody PaymentRequest paymentRequest) {
        log.info("Creating payment: {}", paymentRequest);
        PaymentResponse paymentResponse = paymentService.createPayment(paymentRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(paymentResponse);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<PaymentResponse> updatePayment(
            @PathVariable Long id,
            @RequestBody PaymentRequest paymentRequest) {
        log.info("Updating payment with ID: {}", id);
        PaymentResponse paymentResponse = paymentService.updatePayment(id, paymentRequest);
        return ResponseEntity.ok(paymentResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable Long id) {
        log.info("Deleting payment with ID: {}", id);
        paymentService.deletePayment(id);
        return ResponseEntity.noContent().build();
    }
}

