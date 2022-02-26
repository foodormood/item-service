package com.thetinydev.service.impl;

import com.thetinydev.model.Item;
import com.thetinydev.repository.ItemRepository;
import com.thetinydev.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public List<Item> findAllByCategoryId(UUID categoryId) {
        return itemRepository.findAllByCategoryId(categoryId);
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

}
