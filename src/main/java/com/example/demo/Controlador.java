package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Direcciona directamente al proyecto front
@CrossOrigin(origins="http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas"})//Mapping principal del puerto 8080

public class Controlador {
	@Autowired
	PersonaService service;
	
	@GetMapping
	public List<Persona>listar(){
		return service.listar();
	}
	
	@PostMapping
	public Persona agregar(@RequestBody Persona p) {
		return service.add(p);
	}
}
