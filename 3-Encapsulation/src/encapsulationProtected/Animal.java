package encapsulationProtected;

class Animal {
    // Attribut protégé
    protected String nom;

    // Constructeur
    public Animal(String nom) {
        this.nom = nom;
    }

    // Méthode protégée
    protected void faireDuBruit() {
        System.out.println(nom + " émet un son.");
    }
}




