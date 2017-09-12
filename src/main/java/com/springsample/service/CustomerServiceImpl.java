package com.springsample.service;

import com.springsample.model.Customer;
import com.springsample.repository.CustomerRepository;
import com.springsample.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;


    public CustomerServiceImpl(@Autowired CustomerRepository customerRepository) {
        System.out.println("constructor injection");

        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
