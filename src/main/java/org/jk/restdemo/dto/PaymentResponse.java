package org.jk.restdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponse {
    private Long id;
    private String name;
    private BigDecimal amount;
    private String status;
    private String paymentMethod;
    private LocalDateTime paymentDate;
    private String description;
}
