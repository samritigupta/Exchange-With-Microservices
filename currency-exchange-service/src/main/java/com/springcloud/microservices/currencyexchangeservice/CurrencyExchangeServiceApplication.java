package com.springcloud.microservices.currencyexchangeservice;

import brave.sampler.Sampler;
import com.springcloud.microservices.currencyexchangeservice.entity.Person;
import com.springcloud.microservices.currencyexchangeservice.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration
// Enable service to register with naming server
@EnableDiscoveryClient
public class CurrencyExchangeServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
		PersonRepository personRepository =
				configurableApplicationContext.getBean(PersonRepository.class);
		Person myPerson = new Person("john","doe");
		personRepository.save(myPerson);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
