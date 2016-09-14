package br.edu.unirn;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemploService1Application {

	@Autowired
	private ContatoDAO contatoDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(ExemploService1Application.class, args);
	}
	
	@PostConstruct
	public void init(){
		Contato c1 = new Contato();
		c1.setNome("Romulo");
		c1.setTelefone("999999");
		contatoDAO.save(c1);
		
		Contato c2 = new Contato();
		c2.setNome("Teste");
		c2.setTelefone("8888888");
		contatoDAO.save(c2);
		
	}
}
