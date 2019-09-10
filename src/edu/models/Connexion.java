package edu.models;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.util.Date;

public class Connexion {
	private String ip;
	private Date date;
	private Utilisateurs Utilisateur;
	
	public Connexion(Utilisateurs Utilisateur) throws UnknownHostException {
		this.Utilisateur = Utilisateur; 
		this.date=new Date();
		this.ip=InetAddress.getLocalHost().toString();
	}
	
	@Override //Méthode qui Surdéfinie
	public String toString() {
		// TODO Auto-generated method stub
		return DateFormat.getInstance().format(date)+"|"+ip;
	}
}
