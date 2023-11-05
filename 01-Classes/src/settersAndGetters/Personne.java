package settersAndGetters;

public class Personne {	
	
    // Attributs (variables de classe)
    private String nom;
    private int age;

    // Constructeur sans paramètres
    public Personne() {
        // Vous pouvez laisser le constructeur sans paramètres vide ou définir des valeurs par défaut
    }

    // Méthodes Getter pour l'attribut "nom"
    public String getNom() {
        return nom;
    }

    // Méthode Setter pour l'attribut "nom"
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthodes Getter pour l'attribut "age"
    public int getAge() {
        return age;
    }

    // Méthode Setter pour l'attribut "age"
    public void setAge(int age) {
        this.age = age;
    }

    // Méthode
    public void afficherDetails() {
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
    }
}
