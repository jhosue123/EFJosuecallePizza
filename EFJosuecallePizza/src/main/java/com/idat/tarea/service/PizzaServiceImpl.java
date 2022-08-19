package com.idat.tarea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.idat.tarea.model.Pizza;
import com.idat.tarea.repository.PizzaRepository;

@Service
public class PizzaServiceImpl implements PizzaService {

	
	@Autowired
	private PizzaRepository repository;
	
	@Override
	public List<Pizza> listarPizzas() {
		return repository.findAll();
	}

	@Override
	public Pizza obtenerPizzas() {
		return null;
	}

	@Override
	public void guardarPizzas(Pizza pizza) {
		repository.save(pizza);
	}

	@Override
	public void actualizarPizzas(Pizza pizza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPizzas() {
		// TODO Auto-generated method stub
		
	}

}
