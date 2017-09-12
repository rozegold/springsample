package com.springsample;

import com.springsample.repository.CustomerRepository;
import com.springsample.repository.HibernateCustomerRepositoryImpl;
import com.springsample.service.CustomerService;
import com.springsample.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.springsample"})
public class AppConfig {

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }

    @Bean(name = "customerService")
    public CustomerService getCustomerService() {
        return new CustomerServiceImpl(getCustomerRepository());
    }

}
