package service.custom.impl;

import dto.Customer;
import service.custom.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public boolean addCustomer(Customer customer) {
        System.out.println(customer);
        return false;
    }
}

