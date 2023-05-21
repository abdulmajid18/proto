package com.rozz.productservice.integrations.ExchangeOne;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rozz.productservice.dtos.OrderBookDto;
import com.rozz.productservice.dtos.OrderDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class AmazonOneIntegration {
    private final RestTemplate restTemplate;

    private final String ExchangeUrl;

    public AmazonOneIntegration(
            RestTemplate restTemplate,
            ObjectMapper mapper,

            @Value("${order-service.exchange.one}")
            String exchange
    ) {
        this.restTemplate = restTemplate;
        ExchangeUrl = exchange + "/orderbook/AMZN/open";

    }

    public List<OrderDto> getOpenOrders() {
        return restTemplate.exchange(ExchangeUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<OrderDto>>() {}).getBody();
    }
}
