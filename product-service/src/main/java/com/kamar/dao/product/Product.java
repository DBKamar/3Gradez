package com.kamar.dao.product;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "product")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Product {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


private String name;
private Double price;
}