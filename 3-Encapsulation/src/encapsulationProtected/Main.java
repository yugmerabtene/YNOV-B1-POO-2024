package encapsulationProtected;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet de la classe Chien
        Animal monChien = new Animal("Rex");

        // Utilisation des membres protégés et publics
        System.out.println("Nom du chien : " + monChien.nom);
        monChien.faireDuBruit(); // Appel de la méthode protégée de la classe parente
       
    }
}