package com.rozz.productservice.integrations;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rozz.productservice.dtos.OrderBookDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@Component
@Slf4j
public class ExchangeOneIntegration {
    private final ObjectMapper mapper;
    private final RestTemplate restTemplate;

    private final String ExchangeUrl;

    public ExchangeOneIntegration(
            RestTemplate restTemplate,
            ObjectMapper mapper,

            @Value("${order-service.exchange.one}")
            String exchange
    ) {
        this.mapper = mapper;
        this.restTemplate = restTemplate;
        ExchangeUrl = exchange + "/orderbook/";

    }

    public List<OrderBookDto> getOpenOrders() {
        return restTemplate.exchange(ExchangeUrl, HttpMethod.GET, null,
        new ParameterizedTypeReference<List<OrderBookDto>>() {}).getBody();
    }




}