package main.java.SpringTutorial.repository;

import java.util.ArrayList;
import java.util.List;

import main.java.SpringTutorial.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    
    /* (non-Javadoc)
     * @see main.java.SpringTutorial.repository.CustomerRepository#findAll()
     */
    public List<Customer> findAll() {
        
        List<Customer> customers = new ArrayList<>();
        
        Customer customer = new Customer();
        
        customer.setFirstname("Clark");
        customer.setLastname("Stuth");
        
        customers.add(customer);
        
        return customers;
    }
    
}
