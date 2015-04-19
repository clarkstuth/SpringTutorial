package main.java.SpringTutorial.repository;

import java.util.ArrayList;
import java.util.List;

import main.java.SpringTutorial.model.Customer;

import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    public List<Customer> findAll() {

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstname("Clark");
        customer.setLastname("Stuth");

        customers.add(customer);

        return customers;
    }

}
