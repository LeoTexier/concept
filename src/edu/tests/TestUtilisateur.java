package edu.tests;

import edu.models.Preference;
import edu.models.Utilisateurs;

public class TestUtilisateur {
	public static void main(String[] args) {
		
		Utilisateurs user=new Utilisateurs("leo");
		
		System.out.println(user.getLogin());
		user.setLogin("lara");
		user.postLogin();
		user.postLogin();
		user.postLogin();
		System.out.println(user.toString());
		
		
	}
}
