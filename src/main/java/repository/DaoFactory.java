package repository;

import com.sun.prism.PixelFormat;
import repository.custom.CustomerDao;
import repository.custom.impl.CustomerDaoImpl;
import repository.custom.impl.ItemDaoImpl;
import repository.custom.impl.OrderDaoImpl;
import util.DaoType;

import static util.DaoType.*;

public class DaoFactory {

    private static DaoFactory Instance;

    private DaoFactory(){}

    public static DaoFactory getInstance(){
        return Instance == null ? Instance = new DaoFactory():Instance;
    }

    public <T extends SuperDao>T getDaoType(DaoType type){
        switch (type){
            case  CUSTOMER :return (T)new CustomerDaoImpl();
            case ITEM:return (T) new ItemDaoImpl();
            case ORDER:return (T) new OrderDaoImpl();
        }
        return null;
    }


}
