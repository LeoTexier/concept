package edu.models;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static Application instance;
	private List<Groupe> groupes;
	public List<Groupe> 
	getGroupes() {
		return groupes;
	}


	public void setUtilisateurs(List<Utilisateurs> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}
	private List<Utilisateurs> utilisateurs;
	
	
	public Application() {
		
		groupes=new ArrayList<>();
		utilisateurs=new ArrayList<>();
		
	}
	
	/** Méthode qui permet de créer des groupes et des utilisateurs dans des listes
	 * 
	 */	
	public static Application create() {
		instance = new Application();
		instance.addUsers("Zorro","Bernardo","Garcia","Petit-Tonerre");
		instance.addGroup("Animaux","Héros","Vilains");
		return instance;
	}

	private void addUsers(String...userNames) {
		for(String name:userNames) {
			utilisateurs.add(new Utilisateurs(name));
		
		}
		}
	
	private void addGroup(String...groupNames) {
		for(String name:groupNames) {
			
			groupes.add(new Groupe(name));
		}		
	}		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Application [groupes=" + groupes + ",utilisateurs=" + utilisateurs +"]";
		}

		public List<Utilisateurs> getUtilisateurs() {
			// TODO Auto-generated method stub
			return utilisateurs;
		}
	
	
	}
