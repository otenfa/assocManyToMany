package com.SmEstudos.assocManyToMany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SmEstudos.assocManyToMany.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
