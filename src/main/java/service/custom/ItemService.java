package service.custom;

import dto.Item;
import service.SuperService;

public interface ItemService extends SuperService {

    boolean addItem(Item item);
}
