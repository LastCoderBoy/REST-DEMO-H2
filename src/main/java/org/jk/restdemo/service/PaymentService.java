package org.jk.restdemo.service;


import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jk.restdemo.dto.PaymentRequest;
import org.jk.restdemo.dto.PaymentResponse;
import org.jk.restdemo.entity.Payment;
import org.jk.restdemo.entity.PaymentMethod;
import org.jk.restdemo.entity.User;
import org.jk.restdemo.enums.PaymentStatus;
import org.jk.restdemo.mapper.PaymentMapper;
import org.jk.restdemo.repository.PaymentMethodRepository;
import org.jk.restdemo.repository.PaymentRepository;
import org.jk.restdemo.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final UserRepository userRepository;
    private final PaymentMethodRepository paymentMethodRepository;
    private final PaymentMapper paymentMapper;

    @Transactional(readOnly = true)
    public PaymentResponse getPaymentById(Long id) {
        Payment payment = paymentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Payment not found with ID: " + id));
        return paymentMapper.paymentToPaymentResponse(payment);
    }

    @Transactional(readOnly = true)
    public List<PaymentResponse> getAllPayments() {
        return paymentRepository.findAll().stream()
                .map(paymentMapper::paymentToPaymentResponse)
                .toList();
    }

    @Transactional
    public PaymentResponse createPayment(PaymentRequest paymentRequest) {
        if (paymentRequest == null) throw new IllegalArgumentException("Payment request cannot be null") ;

        User user = userRepository.findById(paymentRequest.getUserId())
                .orElseThrow(() -> new EntityNotFoundException("User not found with ID: " + paymentRequest.getUserId()));

        PaymentMethod paymentMethod = paymentMethodRepository.findById(paymentRequest.getPaymentMethodId())
                .orElseThrow(() -> new EntityNotFoundException("Payment method not found"));

        Payment payment = paymentMapper.paymentRequestToPayment(paymentRequest);
        payment.setUser(user);
        payment.setPaymentMethod(paymentMethod);
        payment.setPaymentDate(LocalDateTime.now());
        payment.setPaymentStatus(PaymentStatus.PENDING);

        Payment savedPayment = paymentRepository.save(payment);
        log.info("Payment saved successfully with ID: {}", savedPayment.getId());
        return paymentMapper.paymentToPaymentResponse(savedPayment);
    }

    @Transactional
    public PaymentResponse updatePayment(Long id, PaymentRequest paymentRequest) {
        if (paymentRequest == null) {
            throw new IllegalArgumentException("Payment request cannot be null");
        }

        Payment payment = paymentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Payment not found with ID: " + id));

        if (paymentRequest.getAmount() != null) {
            payment.setAmount(paymentRequest.getAmount());
        }
        if (paymentRequest.getDescription() != null) {
            payment.setDescription(paymentRequest.getDescription());
        }

        Payment updatedPayment = paymentRepository.save(payment);
        log.info("Payment updated successfully with ID: {}", id);
        return paymentMapper.paymentToPaymentResponse(updatedPayment);
    }

    @Transactional
    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
        log.info("Payment deleted successfully with ID: {}", id);
    }
}

