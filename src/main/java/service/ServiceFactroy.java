package service;

import service.custom.impl.CustomerServiceImpl;
import service.custom.impl.ItemServiceImpl;
import service.custom.impl.OrderServiceImple;
import util.ServiceType;

public class ServiceFactroy {

    private static ServiceFactroy Instance;
    private ServiceFactroy(){}

    public static ServiceFactroy getInstance(){
        return Instance == null ? Instance = new ServiceFactroy():Instance;
    }

    public <T extends SuperService>T getServiceType(ServiceType type){
        switch (type){
            case CUSTOMER : return (T) new CustomerServiceImpl();
            case ITEM : return (T) new ItemServiceImpl();
            case ORDER : return (T) new OrderServiceImple();
        }
        return null;
    }
}
