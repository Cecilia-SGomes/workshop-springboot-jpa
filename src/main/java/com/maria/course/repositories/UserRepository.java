package com.maria.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maria.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
