package com.nsv.jsmbaba.repository;

import com.nsv.jsmbaba.domain.Item;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Slf4j
public class ItemRepository {

    List<Item> itemList= new ArrayList<>();


    public Item addItem(Item item) {
        log.info("item to be persisted={}",item);
        itemList.add(item);
        return item;
    }

    public List<Item> getAllItems() {
        return itemList;
    }
}
