package controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import daos.JogadorDAO;
import daos.TorneioDAO;
import models.Jogador;

public class JogadorController {
	@RequestMapping("/jogador/formJogador")
	public String form() {
		System.out.println("chamou o form de jogador");
	return "jogador/formJogador";


	}


	@PostMapping("/jogador")
	public String adicionar(Jogador jogador)
	{
		JogadorDAO jdao =  new JogadorDAO();
		jdao.inserir(jogador);
		System.out.println("adicionou");
		return "redirect:jogador";
	}

	@GetMapping("/jogador")
	public ModelAndView listar() {
		System.out.println("chamou a listagem do a");
		JogadorDAO jdao = new  JogadorDAO();
		
		List<Jogador> listand = jdao.getListaNome();
		ModelAndView model = new ModelAndView("jogador/listaJogador");
		model.addObject("aluno", listand);
		return model;
		
		
	}

}
