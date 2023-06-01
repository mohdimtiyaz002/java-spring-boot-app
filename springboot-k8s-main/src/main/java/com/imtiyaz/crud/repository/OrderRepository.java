package com.imtiyaz.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imtiyaz.crud.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
