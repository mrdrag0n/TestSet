public class Test {
    public static void main(String[] args) {

        GestionEnseignant gestionHashSet = new EspritHashSet();
        Enseignant e1 = new Enseignant(1, "Dridi", "Aziz");
        Enseignant e2 = new Enseignant(2, "Esprit", "Esprit");
        Enseignant e3 = new Enseignant(3, "Esprit 1", "Esprit 1");

        gestionHashSet.ajouterEnseignant(e1);
        gestionHashSet.ajouterEnseignant(e2);
        gestionHashSet.ajouterEnseignant(e3);

        System.out.println("HashSet: ");
        gestionHashSet.displayEnseignants();
        System.out.println("Recherche Par Id 2: " + gestionHashSet.rechercherEnseignant(2));
        gestionHashSet.supprimerEnseignant(e2);
        gestionHashSet.displayEnseignants();

        GestionEnseignant gestionTreeSet = new EspritTreeSet();
        gestionTreeSet.ajouterEnseignant(e1);
        gestionTreeSet.ajouterEnseignant(e2);
        gestionTreeSet.ajouterEnseignant(e3);

        System.out.println("\nTreeSet: ");
        gestionTreeSet.displayEnseignants();
        System.out.println("Recherche Par Id 3: " + gestionTreeSet.rechercherEnseignant(3));
        gestionTreeSet.supprimerEnseignant(e3);
        gestionTreeSet.displayEnseignants();
    }
}
