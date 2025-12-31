package org.jk.restdemo.enums;

import lombok.Getter;

@Getter
public enum PaymentStatus {
    PENDING ("Payment is in progress..."),
    COMPLETED ("Payment completed successfully"),
    FAILED ("Payment failed"),
    REFUNDED ("Payment refunded");

    private final String description;
    PaymentStatus(String description) {
        this.description = description;
    }
}
