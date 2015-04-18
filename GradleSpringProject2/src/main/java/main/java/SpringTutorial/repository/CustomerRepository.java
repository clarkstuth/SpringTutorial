package main.java.SpringTutorial.repository;

import java.util.List;

import main.java.SpringTutorial.model.Customer;

public interface CustomerRepository {

    List<Customer> findAll();

}