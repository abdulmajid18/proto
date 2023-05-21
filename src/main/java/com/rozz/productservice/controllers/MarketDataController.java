package com.rozz.productservice.controllers;

import com.rozz.productservice.dtos.OrderBookDto;
import com.rozz.productservice.dtos.OrderDto;
import com.rozz.productservice.services.OrderBookService;
import com.rozz.productservice.services.exchangeone.AmazonExchangeOneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/market")
@RequiredArgsConstructor
public class MarketDataController {
    private final AmazonExchangeOneService amazonExchangeOneService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> test() {
        return amazonExchangeOneService.getOrderBooks();
    }
}