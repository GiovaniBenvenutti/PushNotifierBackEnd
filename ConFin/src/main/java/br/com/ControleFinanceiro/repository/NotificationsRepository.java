package br.com.ControleFinanceiro.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.ControleFinanceiro.model.Notification;

public interface NotificationsRepository extends CrudRepository<Notification, Integer> {
	
}
