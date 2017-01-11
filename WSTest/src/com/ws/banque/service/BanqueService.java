package com.ws.banque.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.ws.banque.model.Compte;

@WebService(name = "BanqueWS")
public class BanqueService {
	
	@WebMethod(operationName = "conversionEuroToDh")
	public double conversion(@WebParam(name="montant")double mnt){
		return mnt * 11.2;
	}
	
	@WebMethod
	public Compte getCompte(@WebParam(name="numero")String numero){
		return new Compte(numero, Math.random() * 7400, new Date());
	}
	
	@WebMethod
	public List<Compte> getListeComptes(){
		List<Compte> listeComptes = new ArrayList<Compte>();
		listeComptes.add(new Compte("876000005465468", 71145800, new Date()));
		listeComptes.add(new Compte("456580546565465", 145778, new Date()));
		listeComptes.add(new Compte("134544865546587", 35847, new Date()));
		return listeComptes;
	}

}
