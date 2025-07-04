package com.maria.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maria.course.entities.OrderItem;
import com.maria.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
