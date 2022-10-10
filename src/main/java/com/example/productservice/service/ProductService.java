package com.example.productservice.service;

import com.example.productservice.model.entity.Product;
import com.example.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j

public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(Product product){
        productRepository.save(product);
        log.info("Product "+product.getId() + "is saved");
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


}
