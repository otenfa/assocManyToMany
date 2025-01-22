package com.SmEstudos.assocManyToMany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SmEstudos.assocManyToMany.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
