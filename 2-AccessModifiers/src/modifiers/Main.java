package modifiers;

import java.io.Serializable;

public class Main {
	
	
	// Les modificateurs d'accès sont utilisés en programmation pour définir l'accès et la visibilité des classes, des attributs, des méthodes et des constructeurs dans un programme.

	// Modificateurs d'accès

	// Pour les classes, vous pouvez utiliser "public" ou "par défaut" :

	// `public` : La classe est accessible depuis n'importe quelle autre classe.


	public class MaClassePublic {
	    // Le code de la classe est accessible depuis n'importe quelle autre classe.
	}


	// "par défaut" : La classe n'est accessible que depuis les classes du même package. Cela est utilisé lorsque vous ne spécifiez pas de modificateur d'accès.


	class MaClasseDefaut {
	    // Le code de la classe n'est accessible qu'à partir des classes du même package.
	}


	 // Pour les attributs, les méthodes et les constructeurs, vous pouvez utiliser l'un des modificateurs suivants :

	// `public` : Le code est accessible depuis toutes les classes.


	public class MaClasseAtrributPublic {
	    public int monAttribut; // Cet attribut est accessible depuis n'importe quelle classe.
	    
	    public void maMethode() {
	        // Cette méthode est accessible depuis n'importe quelle classe.
	    }
	}

	// `private` : Le code n'est accessible qu'à l'intérieur de la classe déclarée.

	public class MaClasseAttributPrivate {
	    private int monAttribut; // Cet attribut n'est accessible qu'à l'intérieur de cette classe.
	    
	    private void maMethode() {
	        // Cette méthode n'est accessible qu'à l'intérieur de cette classe.
	    }
	}

	// "par défaut" : Le code n'est accessible qu'à l'intérieur du même package. Cela est utilisé lorsque vous ne spécifiez pas de modificateur d'accès.


	class MaClasse {
	    int monAttribut; // Cet attribut n'est accessible qu'à partir des classes du même package.
	    
	    void maMethode() {
	        // Cette méthode n'est accessible qu'à partir des classes du même package.
	    }
	}

	// `protected` : Le code est accessible dans le même package et par les sous//classes. Vous en apprendrez davantage sur les sous//classes et les superclasses dans le chapitre sur l'héritage.


	public class MaClassePublicAttributProtected {
	    protected int monAttribut; // Cet attribut est accessible dans le même package et par les sous//classes.
	    
	    protected void maMethode() {
	        // Cette méthode est accessible dans le même package et par les sous//classes.
	    }
	}


	// Modificateurs non d'accès

	 // Pour les classes, vous pouvez utiliser "final" ou "abstrait" :

	// `final` : La classe ne peut pas être héritée par d'autres classes. Vous en apprendrez davantage sur l'héritage dans le chapitre sur l'héritage.


	public final class MaClasseFinale {
	    // Cette classe ne peut pas être héritée par d'autres classes.
	}


	// `abstrait` : La classe ne peut pas être utilisée pour créer des objets. Pour accéder à une classe abstraite, elle doit être héritée d'une autre classe. Vous en apprendrez davantage sur l'héritage et l'abstraction dans les chapitres correspondants.


	public abstract class MaClasseAbstract {
	    // Cette classe ne peut pas être utilisée pour créer des objets directement.
	    // Elle doit être héritée par une autre classe qui fournira une implémentation.
	}


	// Pour les attributs et les méthodes, vous pouvez utiliser l'un des modificateurs suivants :

	// `final` : Les attributs et les méthodes ne peuvent pas être redéfinis/modifiés.


	public class MaClasseAttributFinale {
	    final int monAttribut = 10; // Cet attribut ne peut pas être modifié une fois initialisé.
	    
	    final void maMethode() {
	        // Cette méthode ne peut pas être redéfinie par les sous//classes.
	    }
	}


	// `static` : Les attributs et les méthodes appartiennent à la classe plutôt qu'à un objet.


	public class MaClasseAttributStatic {
	    static int monAttributStatique = 5; // Cet attribut appartient à la classe elle//même.
	    
	    static void maMethodeStatique() {
	        // Cette méthode appartient à la classe elle//même.
	    }
	}


	// `transient` : Les attributs et les méthodes sont ignorés lors de la sérialisation de l'objet les contenant.


	public class MaClassePublicHeritage implements Serializable {
	    transient int monAttributTransient; // Cet attribut est ignoré lors de la sérialisation.
	    
	    // ...
	}


	// `synchronized` : Les méthodes ne peuvent être accédées que par un seul thread à la fois.


	public class MaClasseSynchronizedMethod {
	    synchronized void maMethodeSynchro() {
	        // Cette méthode ne peut être exécutée que par un seul thread à la fois.
	    }
	}


	// `volatile` : La valeur d'un attribut n'est pas mise en cache localement par le thread et est toujours lue depuis la "mémoire principale".


	public class MaClasseVolatileAttributs {
	    volatile int monAttributVolatile; // La valeur de cet attribut est toujours lue depuis la mémoire principale.
	}


	// Ces modificateurs d'accès et non d'accès sont essentiels pour contrôler l'accès, l'héritage, la redéfinition et d'autres aspects du comportement des classes et des objets en programmation orientée objet.

}
