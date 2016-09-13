package br.edu.unirn;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class SampleController {

	private ArrayList<Contato> listaContato;
	
	@RequestMapping("/hello")
	public @ResponseBody String hello(){
		return "Hello World";
	} 
	
	@RequestMapping("/contatos")
	public ArrayList<Contato> listaContato(){
		return listaContato;
	}
	
	@PostConstruct
	public void init(){
		listaContato = new ArrayList<>();
		Contato c1 = new Contato();
		c1.setNome("Romulo");
		c1.setTelefone("999999");
		
		Contato c2 = new Contato();
		c2.setNome("Teste");
		c2.setTelefone("8888888");
		
		listaContato.add(c1);
		listaContato.add(c2);
	}
	
	
	
}
