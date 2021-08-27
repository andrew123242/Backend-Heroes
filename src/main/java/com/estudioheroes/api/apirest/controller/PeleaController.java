package com.estudioheroes.api.apirest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.estudioheroes.api.apirest.model.Pelea;

@RestController
public class PeleaController {

	@Autowired
	private PeleaService peleaServices;
		
	/*@GetMapping("api/pelea")
	public List<Pelea> obtenerPelea(){
		List<Pelea> Listapelea = new ArrayList<>();
		
		Pelea p = new Pelea();
		p.setId(1);
		p.setNombreHeroe("Invencible");
		p.setNombreVillano("Homni-man");
		p.setVencedor("Invencible");
		p.setTiempo(60);
		p.getFecha();
		
		Pelea p1 = new Pelea();
		p1.setId(2);
		p1.setNombreHeroe("Andres");
		p1.setNombreVillano("Lex Luthor");
		p1.setVencedor("Andres");
		p1.setTiempo(120);
		p1.getFecha();
		
		Listapelea.add(p);
		Listapelea.add(p1);
		return Listapelea;
	}*/
	
	@PostMapping("api/pelea")
	public Pelea guardarPelea(@RequestBody Pelea pelea) {
		System.out.println(pelea);
		peleaServices.guardar(pelea);
		return pelea;
	}
	@GetMapping("api/pelea")
	public List<Pelea> obtener(){
		return peleaServices.obtenerTodos();
	}
	@GetMapping("api/pelea/{id}")
	public Pelea obtenerPelea(@PathVariable("id")Integer id) {
		return peleaServices.obtenerPelea(id);
	}
	@PutMapping("api/pelea")
	public void actualizarPelea(@RequestBody Pelea pelea) {
		peleaServices.actualizar(pelea);
	}
	@DeleteMapping("api/pelea/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		peleaServices.eliminar(id);
	}
	
}
