package com.usa.ciclo3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.usa.ciclo3.model.Category;
import com.usa.ciclo3.repository.crud.CategoryCrudRepository;



@Repository
public class CategoryRepository {
	
	@Autowired
	private CategoryCrudRepository categoryCrudRepository;
	
	public List<Category> getAll(){
		return (List<Category>) categoryCrudRepository.findAll();
	}
	
	public Optional<Category> getCategory(int id){
		return categoryCrudRepository.findById(id);
	}
	
	public Category save(Category category) {
		return categoryCrudRepository.save(category);
	}

	public void delete(Category category) {
		// TODO Auto-generated method stub
		
	}

}