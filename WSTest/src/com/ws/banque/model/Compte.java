package com.ws.banque.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte implements Serializable{

	
	private String numero ;
	private double solde;
	private Date dateCreation;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Compte(String numero, double solde, Date dateCreation) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	public Compte() {
	}
	
	
	
}
