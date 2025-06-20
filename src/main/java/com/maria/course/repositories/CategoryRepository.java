package com.maria.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maria.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
