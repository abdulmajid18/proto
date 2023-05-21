package com.rozz.productservice.services.exchangeone;

import com.rozz.productservice.dtos.OrderBookDto;
import com.rozz.productservice.dtos.OrderDto;
import com.rozz.productservice.integrations.ExchangeOne.AmazonOneIntegration;
import com.rozz.productservice.integrations.ExchangeOneIntegration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmazonExchangeOneService {
    private final AmazonOneIntegration amazonOneIntegration;

    public AmazonExchangeOneService(AmazonOneIntegration amazonOneIntegration) {
        this.amazonOneIntegration = amazonOneIntegration;
    }

    public List<OrderDto> getOrderBooks() {
        return amazonOneIntegration.getOpenOrders();
    }
}
