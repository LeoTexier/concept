package edu.tests;


import edu.models.Utilisateurs;

public class TestUtilisateur {
	public static void main(String[] args) {
		
		Utilisateurs user=new Utilisateurs("leo");
		
		System.out.println(user.getLogin());
		user.setLogin("lara");
		System.out.println(user.toString());
		
		
	}
}
