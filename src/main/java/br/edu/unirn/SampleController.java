package br.edu.unirn;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class SampleController {
	
	@Autowired
	private ContatoDAO contatoDAO;
	
	@RequestMapping("/hello")
	public @ResponseBody String hello(){
		return "Hello World";
	} 
	
	@RequestMapping("/contatos-old")
	public List<Contato> listaContato(){
		return (List<Contato>) contatoDAO.findAll();
	}
	
	
	
}
