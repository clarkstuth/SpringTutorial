package main.java.SpringTutorial.service;

import java.util.List;

import main.java.SpringTutorial.model.Customer;
import main.java.SpringTutorial.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;        
    }
    
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}