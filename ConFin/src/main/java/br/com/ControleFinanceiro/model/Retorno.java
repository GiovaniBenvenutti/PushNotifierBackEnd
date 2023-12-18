package br.com.ControleFinanceiro.model;

import java.time.LocalDate;

import jakarta.persistence.Column;

//import java.time.LocalDate;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "retorno")
public class Retorno {
	
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idretorno;	
	
	private int idnotification;
	
	private boolean visto;
	
	private boolean clicado;
	
	@Column(columnDefinition = "DATE")
	private LocalDate recebimento;

	public int getIdretorno() {
		return idretorno;
	}

	public void setIdretorno(int idretorno) {
		this.idretorno = idretorno;
	}

	public int getIdnotification() {
		return idnotification;
	}

	public void setIdnotification(int idnotification) {
		this.idnotification = idnotification;
	}

	public boolean isVisto() {
		return visto;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	public boolean isClicado() {
		return clicado;
	}

	public void setClicado(boolean clicado) {
		this.clicado = clicado;
	}

	public LocalDate getRecebimento() {
		return recebimento;
	}

	public void setRecebimento(LocalDate recebimento) {
		this.recebimento = recebimento;
	}

	@Override
	public String toString() {
		return "Retorno [idretorno=" + idretorno + ", idnotification=" + idnotification + ", visto=" + visto
				+ ", clicado=" + clicado + ", recebimento=" + recebimento + "]";
	}

	
	
	
	/*
	
	
	private double valor;
	*/
	
	
}
