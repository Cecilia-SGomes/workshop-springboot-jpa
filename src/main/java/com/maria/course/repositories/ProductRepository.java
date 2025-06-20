package com.maria.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maria.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
