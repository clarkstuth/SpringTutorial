package main.java.SpringTutorial.service;

import java.util.List;

import main.java.SpringTutorial.model.Customer;
import main.java.SpringTutorial.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see main.java.SpringTutorial.service.CustomerService#findAll()
	 */
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}