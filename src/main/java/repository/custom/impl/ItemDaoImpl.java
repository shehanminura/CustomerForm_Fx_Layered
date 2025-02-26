package repository.custom.impl;

import entity.ItemEntity;
import repository.custom.ItemDao;

import java.util.List;

public class ItemDaoImpl implements ItemDao {
    @Override
    public boolean save(ItemEntity entity) {
        System.out.println(entity);
        return false;
    }

    @Override
    public boolean update(String s, ItemEntity entity) {
        return false;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public List<ItemEntity> getAll() {
        return List.of();
    }
}
