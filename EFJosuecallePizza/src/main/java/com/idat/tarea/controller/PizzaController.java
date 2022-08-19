package com.idat.tarea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.tarea.model.Pizza;
import com.idat.tarea.service.PizzaService;

@Controller
@RequestMapping("/api/v1/pizza")
public class PizzaController {
	
	@Autowired
	private PizzaService service;
	
	@GetMapping("/hola")
	public @ResponseBody String holamundo() {
		return "Hola mundo";
	}
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizza> listarPizzas(){
		return service.listarPizzas();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Pizza obtenerPizza(@PathVariable Integer id){
		return null;
	}

	@PostMapping("/guardar")
	public @ResponseBody void guardarPizza(@RequestBody Pizza pizza) {
		service.guardarPizzas(pizza);
	}
	
	@PutMapping("/actualizar")
	public void actualizarPizza(@RequestBody Pizza pizza) {
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarPizza(@PathVariable Integer id) {
		
	}
	

}
