package com.natan.ndelivery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natan.ndelivery.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByOrderByNameAsc();
}
