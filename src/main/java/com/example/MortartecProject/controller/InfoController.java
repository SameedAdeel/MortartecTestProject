package com.example.MortartecProject.controller;

import com.example.MortartecProject.model.Info;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/api/info")
public class InfoController {


    private final Map<Integer, Info> store = new ConcurrentHashMap<>();
    private final AtomicInteger idGenerator = new AtomicInteger();

    /**
     * GET /api/info
     * Returns a list of all Info objects in the store.
     *
     * @return ResponseEntity containing the list of Info objects.
     */
    @GetMapping
    public ResponseEntity<List<Info>> getAllInfo() {
        return ResponseEntity.ok(List.copyOf(store.values()));
    }

    /**
     * POST /api/info
     * Creates a new Info object and adds it to the store.
     *
     * @param newInfo The Info object to be created.
     * @return ResponseEntity containing the created Info object.
     */
    @PostMapping
    public ResponseEntity<Info> createInfo(@RequestBody Info newInfo) {
        int id = idGenerator.incrementAndGet();
        newInfo.setInfoId(id);
        store.put(id, newInfo);
        return ResponseEntity.ok(newInfo);
    }
}
