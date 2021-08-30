package com.example.products;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class Product {
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  private String id;
  private String name;
  private String type;

  Product() {
  }

  Product(String id, String name, String type) {
    this.id = id;
    this.name = name;
    this.type = type;
  }
}