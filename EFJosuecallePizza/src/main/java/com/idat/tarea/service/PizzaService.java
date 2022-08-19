package com.idat.tarea.service;

import java.util.List;

import com.idat.tarea.model.Pizza;



public interface  PizzaService {


	public List<Pizza> listarPizzas();
	public Pizza obtenerPizzas();
	public void guardarPizzas(Pizza pizza);
	public void actualizarPizzas(Pizza pizza);
	public void eliminarPizzas();
}
