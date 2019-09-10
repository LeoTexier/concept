package edu.models;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Utilisateurs {
	private String login;
	private String password;
	private int age;
	private List<Groupe> groupes;
	private List<Connexion> connexions;
	
	private Preferences prefs;

	// Constructeur de l'utilisateur.
	public Utilisateurs(String login/*,int age, String password*/) {
	
		this.login = login;
		/*this.age = age;
		this.password = password;
		connexions=new ArrayList<>();*/
		groupes= new ArrayList<>();
		prefs=Preferences.getDefaut();
	}
	
	/** Méthode post connexion de l'utilisateur sur l'application. 
	 * AJoute une instance de connexion dans la liste des connexions.*/
	public void postLogin() {
		
		try {		
			connexions.add(new Connexion(this));
		} catch (UnknownHostException e) {
			System.out.println("Problème de connexion, erreur IP.");
		}
		
	}
	



	public void setLogin(String login) {this.login=login;}
	
	public String getLogin() {return this.login;}

	public String getPassword() {return password;}

	public void setPassword(String password) {this.password = password;}

	public int getAge() {return age;}

	public void setAge(int age) {
		if(0>=age && age<130) {
			this.age = age;
		}
		
		
	}
	
	public boolean addToGroup(String nom) {
		for(Groupe groupe:Application.instance.getGroupes()) {
			if(nom.contentEquals(groupe.getNom()) && !groupes.contains(groupe)) {
				groupes.add(groupe);
				return true;
			}
			
		}	
		
	return false;
		
	}

	
	@Override
	public String toString() {
		return this.login+connexions+groupes+prefs;
		
	}
	








}