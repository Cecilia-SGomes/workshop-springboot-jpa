package com.maria.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maria.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
