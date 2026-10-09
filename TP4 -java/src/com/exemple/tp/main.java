
package com.exemple.tp;

public class main {
    public static void main(String[] args) {

        Filiere info = new Filiere("Informatique");
        Filiere genie = new Filiere("Génie Civil");

        ETUDIANT e1 = new ETUDIANT("El Idrissi", "Mohamed");
        ETUDIANT e2 = new ETUDIANT("Bentaleb", "Fatima");
        ETUDIANT e3 = new ETUDIANT("Chouaib", "Youssef");
        ETUDIANT e4 = new ETUDIANT("Lahlou", "Salma");
        ETUDIANT e5 = new ETUDIANT("Roussafi", "Hassan");
        ETUDIANT e6 = new ETUDIANT("Amrani", "Aïcha");

        
        info.ajouterEtudiant(e1);
        info.ajouterEtudiant(e2);
        info.ajouterEtudiant(e3);
        info.ajouterEtudiant(e4);
        info.ajouterEtudiant(e5);
        info.ajouterEtudiant(e6);

        genie.ajouterEtudiant(
            new ETUDIANT("Belkahia", "Khadija")
        );
        genie.ajouterEtudiant(
            new ETUDIANT("Laaroussi", "Walid")
        );

        
        System.out.println(info);
        info.afficherEtudiants();

        System.out.println();

        System.out.println(genie);
        genie.afficherEtudiants();

        System.out.println();

      
        System.out.println("Détail de e3 : " + e3);
    }
}