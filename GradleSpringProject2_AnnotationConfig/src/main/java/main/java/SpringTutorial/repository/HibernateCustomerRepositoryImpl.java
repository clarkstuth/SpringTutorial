package main.java.SpringTutorial.repository;

import java.util.ArrayList;
import java.util.List;

import main.java.SpringTutorial.model.Customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${someProperty}")
    private String someValue;
    
    public List<Customer> findAll() {

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        /*customer.setFirstname("Clark");*/
        customer.setFirstname(someValue);
        customer.setLastname("Stuth");

        customers.add(customer);

        return customers;
    }

}

