package br.com.ControleFinanceiro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ControleFinanceiro.model.Retorno;
import br.com.ControleFinanceiro.repository.RetornoRepository;

@Service
public class RetornooService {

	@Autowired
	private RetornoRepository repository;

	public Iterable<Retorno> selecionar() {
		return repository.findAll();
	}
	
	public Retorno cadastrar(Retorno patrimonio) {
		return repository.save(patrimonio);		
	}
	
	public Retorno alterar(Retorno patrimonio) {
		return repository.save(patrimonio);
	}
	
	public void remover(int codigo) {
		repository.deleteById(codigo);
	}
	
	
}
