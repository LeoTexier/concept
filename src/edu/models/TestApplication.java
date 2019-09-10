package edu.models;

public class TestApplication {

	public static void main(String[] args) {
		Application.create();
		Application.instance.getUtilisateurs().get(0).addToGroup("Animaux");
		
	}

}
