package com.example.demo;

import java.util.List;
import org.springframework.data.repository.Repository;

//Metodos de Spring que tambien se pueden usar crud

public interface PersonaRepositorio extends Repository<Persona, Integer>{

	List<Persona> findAll();
	//Persona findOne(int id); No carga con este metodo
	Persona save(Persona p);
	void delete (Persona p);

}
