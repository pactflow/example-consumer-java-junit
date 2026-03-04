package com.example.products;

import org.apache.http.client.fluent.Request;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class ProductClient {
  private String url;

  public ProductClient setUrl(String url) {
    this.url = url;

    return this;
  }

  public Product getProduct(String id) throws IOException {
    return (Product) Request.Get(this.url + "/product/" + id)
      .addHeader("Accept", "application/json")
      .execute().handleResponse(httpResponse -> {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(httpResponse.getEntity().getContent(), Product.class);
      });
  }

  public List<Product> getProducts() throws IOException {
    return (List<Product>) Request.Get(this.url + "/products")
      .addHeader("Accept", "application/json")
      .execute().handleResponse(httpResponse -> {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(httpResponse.getEntity().getContent(), new TypeReference<List<Product>>(){});
      });
  }
}
