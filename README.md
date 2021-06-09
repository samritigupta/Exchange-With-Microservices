# Exchange-With-Microservices
Project on end-end demonstration of use of microservices. 

Three microservices Currency Calculation, Currency Exchange and Limit service uses 'Spring cloud config server microservice' as config server. As the number of microservices increases and for microservice we need different configuration, so maintaining it separately by each service is a difficult task.
1. Limit service -> demostrates how can we connect with centralised 'Spring cloud config server' (which is further connected to git repo for fetching configuration) and fetch the configuration from it depending on the env i.e. qa, dev or production.
2. Currency Exchange -> service stores the currency exchange values. It connects with H2 db for fetching the values.
3. Currency Calculation -> given a query from -> to and amount return the currency exchange value. It fetches currency exchange rate from 'Currency Exchange service'.
4. netflix-zuul-api-gateway-server -> ZUUL used as API gateway which is basically a load balancer , that calls appropriate Currency Calculation microservice corresponding to request URL.
5. netflix-eureka-naming-server -> for service discovery. Holds information about all client service applications. Each microservice registers itself with the Eureka naming server. The naming server registers the client services with their port numbers and IP addresses. It is also known as Discovery Server.
6. 

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
