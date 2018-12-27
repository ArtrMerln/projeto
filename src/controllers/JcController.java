package controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import daos.JogadorDAO;
import models.Jogador;

public class JcController {
	@RequestMapping("/jogador/formJogador")
	public String form() {
		System.out.println("chamou o form de jogador");
	return "jogador/fJogador";


	}


	@RequestMapping("/jogador/cajus")
	public String img() {
		System.out.println("chamou o caju");
	return "jogador/caju";


	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@PostMapping("/jogador")
	public String adicionar(Jogador jogador)
	{
		JogadorDAO jdao =  new JogadorDAO();
		jdao.inserir(jogador);
		System.out.println("adicionou");
		return "redirect:jogador";
	}
}
