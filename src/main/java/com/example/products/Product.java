package com.example.products;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
class Product {
  @JsonFormat( shape = JsonFormat.Shape.STRING)
  private String id;
  private String name;
  private String type;

  Product() {}

  Product(String id, String name, String type) {
    this.id = id;
    this.name = name;
    this.type = type;
  }
}