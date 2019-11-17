package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Implementan todos los metodos del servicio
@Service
public class PersonaServiceImp implements PersonaService {
	
	@Autowired
	private PersonaRepositorio repositorio;
	
	@Override
	public List<Persona> listar() {
		return repositorio.findAll();
	}
	
	@Override
	public Persona listarId(int id) {
		return null;
	}

	@Override
	public Persona add(Persona p) {
		return repositorio.save(p);	
	}

	@Override
	public Persona edit(Persona u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
