package com.kamar.rest.product.dto;


import lombok.*;


@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ProductDTO {
private Long id;
private String name;
private Double price;
}