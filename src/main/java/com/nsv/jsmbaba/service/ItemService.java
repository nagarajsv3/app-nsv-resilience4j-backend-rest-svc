package com.nsv.jsmbaba.service;

import com.nsv.jsmbaba.domain.Item;

import java.util.List;

public interface ItemService {
    Item addItem(Item item);
    List<Item> getAllItems();

}
