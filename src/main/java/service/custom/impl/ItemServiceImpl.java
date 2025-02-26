package service.custom.impl;

import dto.Item;
import entity.ItemEntity;
import org.modelmapper.ModelMapper;
import repository.DaoFactory;
import repository.custom.ItemDao;
import service.custom.ItemService;
import util.DaoType;

public class ItemServiceImpl implements ItemService {

ItemDao dao= DaoFactory.getInstance().getDaoType(DaoType.ITEM);

    @Override
    public boolean addItem(Item item) {
        System.out.println(item);
        ItemEntity itemEntity = new ModelMapper().map(item, ItemEntity.class);

        dao.save(itemEntity);
        return false;
    }
}
