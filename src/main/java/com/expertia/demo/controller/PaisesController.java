package com.expertia.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expertia.demo.model.Pais;

@RestController
@RequestMapping("/api")
public class PaisesController {

	@GetMapping("/paises")
	public ResponseEntity<List<Pais>> list(){
		List<Pais> paises = Arrays.asList(new Pais("PE", "Peru"), new Pais("CO","Colombia"));
		ResponseEntity<List<Pais>> respuesta = new ResponseEntity<List<Pais>>(paises, HttpStatus.OK);
		return respuesta;
	}
	
}
