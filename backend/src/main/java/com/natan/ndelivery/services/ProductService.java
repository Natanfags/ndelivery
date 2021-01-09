package com.natan.ndelivery.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.natan.ndelivery.dto.ProductDTO;
import com.natan.ndelivery.entities.Product;
import com.natan.ndelivery.repositories.ProductRepository;

@Component
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> all = productRepository.findAllByOrderByNameAsc();
        return all.stream().map(ProductDTO::new).collect(Collectors.toList());
    }

}
