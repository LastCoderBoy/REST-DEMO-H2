package org.jk.restdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequest {
    private Long userId;
    private Long paymentMethodId;
    private BigDecimal amount;
    private LocalDateTime paymentDate;
    private String description;
}
