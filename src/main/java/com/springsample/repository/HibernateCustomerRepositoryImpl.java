package com.springsample.repository;

import com.springsample.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Shreya");
        customer.setLastName("Mishra");

        customers.add(customer);
        return customers;
    }
}
