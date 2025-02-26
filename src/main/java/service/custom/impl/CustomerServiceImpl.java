package service.custom.impl;

import dto.Customer;
import entity.CustomerEntity;
import org.modelmapper.ModelMapper;
import repository.DaoFactory;
import repository.custom.CustomerDao;
import service.custom.CustomerService;
import util.DaoType;


public class CustomerServiceImpl implements CustomerService {

    CustomerDao dao = DaoFactory.getInstance().getDaoType(DaoType.CUSTOMER);

    @Override
    public boolean addCustomer(Customer customer) {
        System.out.println(customer);
        CustomerEntity customerEntity = new ModelMapper().map(customer, CustomerEntity.class);
        dao.save(customerEntity);


        return false;
    }
}

