package com.thetinydev.api;

import com.thetinydev.model.Item;
import com.thetinydev.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequiredArgsConstructor
@RestController
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/all")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(itemService.findAll());
    }

    @GetMapping("/by-category/{categoryId}")
    public ResponseEntity<?> findAllByCategoryId(@PathVariable UUID categoryId) {
        return ResponseEntity.ok(itemService.findAllByCategoryId(categoryId));
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Item item) {
        return ResponseEntity.ok(itemService.save(item));
    }
}
