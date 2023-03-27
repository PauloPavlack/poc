package com.estudo.poc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class PocController {

	@GetMapping("test")
	public ResponseEntity<String> get() {
		return new ResponseEntity<>("teste", HttpStatus.OK);
	}

	@PutMapping("criar-arquivo")
	public String criarArquivo() {
		ManipuladorDeArquivo manipulador = new ManipuladorDeArquivo();
		return manipulador.criarArquivo();
	}

	@PutMapping("ler-arquivo")
	public String lerArquivo() {
		ManipuladorDeArquivo manipulador = new ManipuladorDeArquivo();
		return manipulador.lerArquivo();
	}

}
