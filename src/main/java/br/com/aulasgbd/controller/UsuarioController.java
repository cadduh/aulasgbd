package br.com.aulasgbd.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aulasgbd.beans.Usuario;
import br.com.aulasgbd.dao.UsuarioDAO;

@RestController
public class UsuarioController {
	
	private UsuarioDAO dao;
	
	@GetMapping("/list")
	public ResponseEntity<List<Usuario>> getAll(){
		
		List<Usuario> list = (List<Usuario>) dao.findAll();
		
		if(list.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(list);
		
	}
	
	
}
