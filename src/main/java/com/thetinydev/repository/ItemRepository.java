package com.thetinydev.repository;

import com.thetinydev.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, UUID> {
    List<Item> findAllByCategoryId(UUID categoryId);
}
