package objectConstructor;

public class Personne {	
	
	  // Attributs (variables de classe)
    String nom;
    int age;

    // Constructeur de notre classe
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Méthode // Fonction
    public void afficherDetails() {
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
    }

  
}
