package com.springsample.repository;

import com.springsample.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
