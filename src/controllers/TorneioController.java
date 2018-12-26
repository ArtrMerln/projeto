package controllers;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import daos.JogadorDAO;
import daos.TorneioDAO;
import models.Jogador;
import models.Torneio;

@Controller
public class TorneioController {
	@RequestMapping("/torneio/formTorneio")
	public String form() {
		System.out.println("chamou o form de torneio");
		return "torneio/formTorneio";

	}

	@PostMapping("/torneio")
	public String adicionar(Torneio torneio) {
		TorneioDAO tdao = new TorneioDAO();
		tdao.inserir(torneio);
		System.out.println("adicionou");
		return "redirect:../jogador/formJogador";
	}
//
//@GetMapping("/")
//public ModelAndView listar() {
//	System.out.println("cjampu a lsitage");
//	TorneioDAO tordao = new TorneioDAO();
//	
//	List<Torneio> listand = tordao.
//	
//	
//	
//	
//}

}
