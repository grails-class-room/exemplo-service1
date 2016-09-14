package br.edu.unirn;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="contatos",rel="contatos")
public interface ContatoDAO extends CrudRepository<Contato, Long>{

	public List<Contato> findAllByNomeLike(String nome);
	
}
