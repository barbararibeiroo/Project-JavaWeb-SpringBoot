package com.javaspringboot.resources.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaspringboot.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	

}