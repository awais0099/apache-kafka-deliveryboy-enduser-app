### Kafka with Spring Boot - "Deliverboy" and "Enduser" App

This project demonstrates a basic microservices architecture using Apache Kafka and Spring Boot, consisting of two distinct services: **Deliverboy** and **Enduser**.

- **Deliverboy**: This Spring Boot service is responsible for generating, producing, or publishing data to a Kafka topic. It simulates the role of a producer, continuously sending messages or events that represent some type of data.
  
- **Enduser**: This Spring Boot service functions as a consumer of the data produced by Deliverboy. It reads or consumes and processes the messages from the Kafka topic.

### Purpose of the Project:
The main goal of this project is to explore and understand the integration of Kafka with Spring Boot, providing a hands-on experience in message-driven architecture. By separating the producer and consumer into two distinct applications, the project allows you to delve deeper into how Kafka facilitates real-time communication and decoupling between services.
