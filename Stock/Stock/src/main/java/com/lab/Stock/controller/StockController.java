package com.lab.Stock.controller;

import com.lab.Stock.entity.Stock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
    @PostMapping("/stock")
    public ResponseEntity<?> getStock(){
        return new ResponseEntity<Integer>(10, HttpStatus.OK);
    }
}
