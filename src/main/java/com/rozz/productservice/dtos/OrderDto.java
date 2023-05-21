package com.rozz.productservice.dtos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto{
    private String product;
    private int quantity;
    private double price;
    private String side;
    private List<ExecutionDto> executions;
    private String orderType;
    private int cumulativeQuantity;
    private int cumulativePrice;
}
