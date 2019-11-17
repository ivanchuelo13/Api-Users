package com.example.demo;

import java.util.List;


//Metodos para el proyecto crud
public interface PersonaService {
	public List <Persona> getAllList();
    public Persona getById(Long id);
	Persona add(Persona p);
	Persona edit(Persona p);
	Persona delete(int id);
}