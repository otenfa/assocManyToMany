package com.SmEstudos.assocManyToMany.services;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SmEstudos.assocManyToMany.dto.CategoryDTO;
import com.SmEstudos.assocManyToMany.dto.ProductDTO;
import com.SmEstudos.assocManyToMany.entities.Category;
import com.SmEstudos.assocManyToMany.entities.Product;
import com.SmEstudos.assocManyToMany.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Transactional
	public ProductDTO insert(ProductDTO dto) {
		
		Product entity = new Product();
		entity.setName(dto.getName());
		entity.setPrice(dto.getPrice());
		
		for (CategoryDTO catDto : dto.getCategories()) {
			Category cat = new Category();
			cat.setId(catDto.getId());
			entity.getCategories().add(cat);
		}
		
		entity = productRepository.save(entity);

		return new ProductDTO(entity);
		
	}
	
}
