package com.example.demo;

import java.util.List;


//Metodos para el proyecto crud
public interface PersonaService {
	List <Persona>listar();
    Persona listarId(int id);
	Persona add(Persona p);
	Persona edit(Persona p);
	Persona delete(int id);
}