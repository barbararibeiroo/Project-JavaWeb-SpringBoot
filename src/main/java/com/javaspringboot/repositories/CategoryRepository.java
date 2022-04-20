package com.javaspringboot.resources.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaspringboot.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}