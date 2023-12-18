package br.com.ControleFinanceiro.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ControleFinanceiro.model.Notification;
import br.com.ControleFinanceiro.repository.NotificationsRepository;

@Service
public class NotificationsService {

	@Autowired
	private NotificationsRepository repository;

	public Iterable<Notification> selecionar() {
		return repository.findAll();
	}
	
	public Notification cadastrar(Notification entidade) {
		return repository.save(entidade);		
	}
	
	public Notification alterar(Notification entidade) {
		return repository.save(entidade);
	}
	
	public void remover(int codigo) {
		repository.deleteById(codigo);
	}
	
	// criar aqui um moetodo para retornar entidade por id
	/*public Notification pickEntidadeById(int codigo) {
	    Optional<Notification> entidadeOpt = repository.findById(codigo);
	    if (entidadeOpt.isPresent()) {
	    	Notification ent = entidadeOpt.get();
	        return ent;
	    } else {
	    	Notification ent = new Notification();
	    	ent.car.setRazaosocial("quase lá");
	    	ent.setInfad("end");
	    	ent.setSubclasse("do ");
	    	ent.setClasse("veio ");
	    	ent.setTipo("back ");
		    return ent;
	    }
	}*/

	
	
	
}
