package br.com.casadocodigo.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.casadocodigo.loja.models.Produto;

@Repository
@Transactional
public class ProdutoDAO {

	@PersistenceContext //Essa annotation faz o processo de criação e inicialização do EntityManager
	private EntityManager manager;
	
	public void gravar(Produto produto){
		manager.persist(produto);
	}
}
