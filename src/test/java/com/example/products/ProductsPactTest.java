package com.example.products;

import org.junit.jupiter.api.extension.ExtendWith;
import au.com.dius.pact.consumer.MockServer;
import au.com.dius.pact.core.model.V4Pact;
import au.com.dius.pact.core.model.annotations.Pact;
import au.com.dius.pact.consumer.dsl.PactBuilder;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import org.junit.jupiter.api.Test;
import au.com.dius.pact.core.model.PactSpecVersion;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@ExtendWith(PactConsumerTestExt.class)
@PactTestFor(providerName = "pactflow-example-provider-springboot")
public class ProductsPactTest {

  @Pact(consumer="pactflow-example-consumer-java-junit")
  public V4Pact getProduct(PactBuilder builder) {

    PactDslJsonBody body = new PactDslJsonBody();
    body.stringType("name", "product name");
    body.stringType("type", "product series");
    body.stringType("id", "5cc989d0-d800-434c-b4bb-b1268499e850");

      return builder
        .usingLegacyDsl()
        .addMetadataValue("matt", "rocks")
        .given("a product with ID 10 exists")
        .uponReceiving("a request to get a product")
          .path("/product/10")
          .method("GET")
        .willRespondWith()
          .status(200)
          .body(body)
        .toPact(V4Pact.class);
    }

  @PactTestFor(pactMethod = "getProduct", pactVersion = PactSpecVersion.V4)
  @Test
  public void testGetProduct(MockServer mockServer) throws IOException {
    Product product = new ProductClient().setUrl(mockServer.getUrl()).getProduct("10");

    assertThat(product.getId(), is("5cc989d0-d800-434c-b4bb-b1268499e850"));
  }
}