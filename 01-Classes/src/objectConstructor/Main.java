package objectConstructor;

public class Main {

	// PARTIE IHM
    public static void main(String[] args) {
        // Instanciation / Cr�ation d'objets de la classe Personne
        Personne personne1 = new Personne("Alice", 30);
        Personne personne2 = new Personne("Bob", 25);

        // Appel de la m�thode pour afficher les d�tails
        personne1.afficherDetails();
        personne2.afficherDetails();
    }
}
