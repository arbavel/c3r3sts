package com.usa.ciclo3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.usa.ciclo3.model.Papeleria;
import com.usa.ciclo3.repository.crud.PapeleriaCrudRepository;

@Repository
public class PapeleriaRepository {
	
	@Autowired
	private PapeleriaCrudRepository papeleriaCrudRepository;
	
	public List<Papeleria> getAll(){
		return (List<Papeleria>) papeleriaCrudRepository.findAll();
	}
	
	public Optional<Papeleria> getPapeleria(int id){
		return papeleriaCrudRepository.findById(id);
	}
	
	public Papeleria save(Papeleria papeleria) {
		return papeleriaCrudRepository.save(papeleria);
	}

}
