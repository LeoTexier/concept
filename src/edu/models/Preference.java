package edu.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Preference {
	private String nom;
	private Object valeur;
	//ArrayList<Preference>preferences;
	
	
	public Object getValeur() {
		return valeur;
	}
	public void setValeur(Object valeur) {
		this.valeur = valeur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public Preference(String nom, Object valeur) {
		this.nom=nom;
		this.valeur=valeur;
		
	}
	
	public static List<Preference> getDefault(){
		/*List<Preference> prefs = new ArrayList<>();
		prefs.add(new Preference("admin",true));
		prefs.add(new Preference("bgColor","black"));*/
		
	    return Arrays.asList(new Preference("admin",true),new Preference("bgColor","black"));
		
		
	}
	
}
