package main.java.SpringTutorial.service;

import java.util.List;

import main.java.SpringTutorial.model.Customer;
import main.java.SpringTutorial.repository.CustomerRepository;
import main.java.SpringTutorial.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
    
    /* (non-Javadoc)
     * @see main.java.SpringTutorial.service.CustomerService#findAll()
     */
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
    
}
