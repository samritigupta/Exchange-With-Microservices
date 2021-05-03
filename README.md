# Exchange-With-Microservices
Project on end-end demonstration of use of microservices.

# Technology used
1. Spring Boot
2. Ribbon for client side load balancing
3. Rabbit Mq: transferring logs
4. Zippin for monitoring 
5. H2 Database 
6. Eureka server 
# Overview
- Different microservices created. As shown in figure below.
1. Currency Calculation
2. Currency Exchange
3. Limit 
<img src="Images/overview.jpeg" width=250 height=200/>

- Ribbon is used for load balancing and scaling. It is connected with Eureka naming server for services information.
<img src="Images/Ribbon.jpeg" width=250 height=200/>

- For monitoring and visibility Zippin is used. For transfering log messages Rabbit mq is being used.

# Components
- Created different microservices
- Establish communication between microservices
- Enable load balancing, scaling up and down of microservices. 
- Centralize the configuration of microservices with Spring Cloud Config Server
- Implement Eureka Naming Server and Distributed tracing with Spring Cloud Sleuth and Zipkin
- Created fault tolerant microservices with Zipkin.
- Used H2 database for saving information
