package com.rozz.productservice.model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "order")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;
    @Column(name = "product")
    private String product;
//    private double price;
//    private int quantity;
//    private String side;
//    private String type;
//    private String exchangeURL;
}

