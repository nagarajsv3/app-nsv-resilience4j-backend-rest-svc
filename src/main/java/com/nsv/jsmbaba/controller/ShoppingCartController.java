package com.nsv.jsmbaba.controller;

import com.nsv.jsmbaba.domain.Item;
import com.nsv.jsmbaba.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ShoppingCartController {

    @Autowired
    private ItemService itemService;

    @PostMapping(name="/addItem", value="/addItem", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Item addItem(@RequestBody Item item){
        log.info("item={}",item);
        Item item1 = itemService.addItem(item);
        return item1;
    }

    @GetMapping(name="/getAllItems", value="/getAllItems", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }



}
