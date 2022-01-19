package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidades")


public class helloController { 
	
	@GetMapping
	public String mentalidades() {
		return "Nesse exercício trabalhamos com a habilidade de atenção aos detalhes"
				+ " e a mentalidade de persistência! ";
	}
	
	@RequestMapping("/objetivo")
	
	@GetMapping
	public String objetivo() {
		return "Meu objetivo essa semana é absorver o máximo de conteúdo de Spring-boot";
		}
		
}

