package main.java.SpringTutorial.service;

import java.util.List;

import main.java.SpringTutorial.model.Customer;

public interface CustomerService {

    List<Customer> findAll();

}