package com.example.products;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
class Product {
  @JsonFormat( shape = JsonFormat.Shape.STRING)
  private String id;
  private String name;
  private String type;
  private String foo;

  Product() {}

  Product(String id, String name, String type, String foo) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.foo = foo;
  }
}