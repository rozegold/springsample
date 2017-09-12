package com.springsample.service;

import com.springsample.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
