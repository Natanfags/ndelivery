package com.natan.ndelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natan.ndelivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
