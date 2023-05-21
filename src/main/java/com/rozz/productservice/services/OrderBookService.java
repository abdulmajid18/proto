package com.rozz.productservice.services;

import com.rozz.productservice.integrations.ExchangeOneIntegration;
import com.rozz.productservice.dtos.OrderBookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderBookService {
    private final ExchangeOneIntegration exchangeOneIntegration;

    public OrderBookService(ExchangeOneIntegration exchangeOneIntegration) {
        this.exchangeOneIntegration = exchangeOneIntegration;
    }

    public List<OrderBookDto> getOrderBooks() {
        return exchangeOneIntegration.getOpenOrders();
    }
}
