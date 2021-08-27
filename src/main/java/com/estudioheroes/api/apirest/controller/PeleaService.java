package com.estudioheroes.api.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudioheroes.api.apirest.model.Pelea;

@Service
public class PeleaService {

	@Autowired
	private PeleaRepository peleaRepository;

	public Pelea guardar (Pelea pelea) {
		return peleaRepository.save(pelea);
	}	
	
	public List<Pelea> obtenerTodos(){
		return peleaRepository.findAll();
	}
	
	public Pelea obtenerPelea(Integer id) {
		return peleaRepository.getOne(id);
	}
	public Pelea  actualizar (Pelea pelea) {
		return peleaRepository.save(pelea);
	}
	public void eliminar(Integer id) {
		peleaRepository.deleteById(id);
	}
}

