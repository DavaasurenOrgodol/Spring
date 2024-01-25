package com.lab.Product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController{
    @Autowired
    StockFeignClient stockFeignClient;

    @PostMapping("/getProducts")
    public ResponseEntity<?> getProducts() {
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }
    @FeignClient(name = "stock")
    interface StockFeignClient{
        @PostMapping("/stock")
        public ResponseEntity<?> getStock();
    }
}
