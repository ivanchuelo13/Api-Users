package com.example.demo;

import java.util.List;


//Metodos para el proyecto crud
public interface PersonaService {
	public List <Persona> getAllList();
    public Persona getById(long id);
	Persona add(Persona p);
	Persona edit(Persona p);
	Persona delete(long id);
}