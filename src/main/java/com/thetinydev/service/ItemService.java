package com.thetinydev.service;

import com.thetinydev.model.Item;

import java.util.List;
import java.util.UUID;

public interface ItemService {
    List<Item> findAll();
    List<Item> findAllByCategoryId(UUID categoryId);
    Item save(Item item);
}
