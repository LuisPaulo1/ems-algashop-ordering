package com.algaworks.algashop.ordering.infrastructure.shipping.client.fake;

import com.algaworks.algashop.ordering.domain.model.order.shipping.ShippingCostService;
import com.algaworks.algashop.ordering.domain.model.commons.Money;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ShippingCostServiceFakeImpl implements ShippingCostService {
    @Override
    public CalculationResult calculate(CalculationRequest request) {
        return new CalculationResult(
                new Money("20"),
                LocalDate.now().plusDays(5)
        );
    }
}