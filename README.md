# Example Java Junit Consumer

![Build](https://github.com/pactflow/example-consumer-java-junit/workflows/Build/badge.svg)

[![Can I deploy Status](https://testdemo.pactflow.io/pacticipants/pactflow-example-consumer-java-junit/branches/master/latest-version/can-i-deploy/to-environment/production/badge.svg)](https://testdemo.pactflow.io/overview/provider/pactflow-example-provider-springboot/consumer/pactflow-example-consumer-java-junit)

[![Pact Status](https://testdemo.pactflow.io/pacts/provider/pactflow-example-provider-springboot/consumer/pactflow-example-consumer-java-junit/latest/badge.svg)](https://testdemo.pactflow.io/pacts/provider/pactflow-example-provider-springboot/consumer/pactflow-example-consumer-java-junit/latest) (latest pact)

[![Pact Status](https://testdemo.pactflow.io/pacts/provider/pactflow-example-provider-springboot/consumer/pactflow-example-consumer-java-junit/latest/prod/badge.svg)](https://testdemo.pactflow.io/pacts/provider/pactflow-example-provider-springboot/consumer/pactflow-example-consumer-java-junit/latest/prod) (prod/prod pact)

This is an example of a Java consumer that uses Pact with Junit, [Pactflow](https://pactflow.io) and GitHub Actions to ensure that it is compatible with the expectations its consumers have of it.

The project uses a Makefile to simulate a very simple build pipeline with two stages - test and deploy.

It is using a public tenant on Pactflow, which you can access [here](https://testdemo.pactflow.io) using the credentials `dXfltyFMgNOFZAxr8io9wJ37iUpY42M`/`O5AIZWxelWbLvqMd8PkAVycBJh2Psyg1`.

See the canonical consumer example here: https://github.com/pactflow/example-consumer
See also the full [Pactflow CI/CD Workshop](https://docs.pactflow.io/docs/workshops/ci-cd) for which this can be substituted in as the "consumer".

## Pre-requisites

**Software**:

https://docs.pactflow.io/docs/workshops/ci-cd/set-up-ci/prerequisites/

## Usage

```sh
make test
```
