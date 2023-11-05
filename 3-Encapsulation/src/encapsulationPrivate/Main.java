package encapsulationPrivate;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet de la classe CompteBancaire
        CompteBancaire monCompte = new CompteBancaire("John Doe", 1000.0);

        // Accès aux méthodes publiques pour effectuer des opérations sur le compte
        monCompte.deposer(500.0);
        monCompte.retirer(200.0);

        // Accès en lecture aux données encapsulées à l'aide des getters
        System.out.println("Titulaire du compte : " + monCompte.getTitulaire());
        System.out.println("Solde du compte : " + monCompte.getSolde());
    }
}

