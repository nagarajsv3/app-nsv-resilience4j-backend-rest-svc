package com.nsv.jsmbaba.service;

import com.nsv.jsmbaba.domain.Item;
import com.nsv.jsmbaba.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item addItem(Item item) {
        Item addedItem = itemRepository.addItem(item);
        return addedItem;
    }

    @Override
    public List<Item> getAllItems() {
        List<Item>  items = itemRepository.getAllItems();
        return items;
    }
}
