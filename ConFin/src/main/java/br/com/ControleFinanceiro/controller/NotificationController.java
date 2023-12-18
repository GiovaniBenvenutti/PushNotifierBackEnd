package br.com.ControleFinanceiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ControleFinanceiro.model.Notification;
import br.com.ControleFinanceiro.service.NotificationsService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")  // endereço que recebe acesso , se quiser que seja publico tem que colocar "*"
@RequestMapping("piante/notifications")
public class NotificationController {
	
	@Autowired
	private NotificationsService service;
	
	@GetMapping
	public Iterable<Notification> selecionar() {
		return service.selecionar();
	}
	
	@PostMapping
	public Notification cadastrar(@RequestBody Notification entidade) {
		return service.cadastrar(entidade);
	}
	
	@PutMapping
	public Notification alterar(@RequestBody Notification entidade) {
		return service.alterar(entidade);
	}
	
	@DeleteMapping("/{codigo}")
	public void remover(@PathVariable int codigo) {
		service.remover(codigo);
	}
	
	// -----------------------------------
	/*
	@GetMapping("/{codigo}")
	public Notification entidadeById(@PathVariable int codigo) {
		return service.pickEntidadeById(codigo);
	}
	*/
	
	

}
