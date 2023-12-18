package br.com.ControleFinanceiro.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "notification")
public class Notification {

	// Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int idnotification;

	private String cardtitulo;

	private String detalhes;

	private String link;
	
	@Column(columnDefinition = "DATE")
	private LocalDate envio;

	public int getIdnotification() {
		return idnotification;
	}

	public void setIdnotification(int idnotification) {
		this.idnotification = idnotification;
	}

	public String getCardtitulo() {
		return cardtitulo;
	}

	public void setCardtitulo(String cardtitulo) {
		this.cardtitulo = cardtitulo;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public LocalDate getEnvio() {
		return envio;
	}

	public void setEnvio(LocalDate envio) {
		this.envio = LocalDate.now();
	}

	@Override
	public String toString() {
		return "Notification [idnotification=" + idnotification + ", cardtitulo=" + cardtitulo + ", detalhes="
				+ detalhes + ", link=" + link + ", envio=" + envio + "]";
	}


	
	
}
