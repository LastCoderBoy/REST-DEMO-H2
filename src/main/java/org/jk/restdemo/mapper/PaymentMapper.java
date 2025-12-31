package org.jk.restdemo.mapper;

import org.jk.restdemo.dto.PaymentRequest;
import org.jk.restdemo.dto.PaymentResponse;
import org.jk.restdemo.entity.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    @Mapping(target = "paymentMethod", source = "paymentMethod.name")
    @Mapping(target = "status", source = "paymentStatus")
    @Mapping(target = "name", source = "user.name")
    PaymentResponse paymentToPaymentResponse(Payment payment);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "paymentMethod.id", source = "paymentMethodId")
    Payment paymentRequestToPayment(PaymentRequest paymentRequest);
}
