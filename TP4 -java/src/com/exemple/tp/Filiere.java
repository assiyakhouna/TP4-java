
package com.exemple.tp;

public class Filiere {
    private static int compteur = 0;
    private final int id;
    private String nom;
    private ETUDIANT[] etudiants;
    private int nbEtudiants;

    public Filiere(String nom) {
        this.id = ++compteur;
        this.nom = nom;
        this.etudiants = new ETUDIANT[5];
        this.nbEtudiants = 0;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbEtudiants() {
        return nbEtudiants;
    }

    public void ajouterEtudiant(ETUDIANT e) {
        if (nbEtudiants == etudiants.length) {
            ETUDIANT[] tmp = new ETUDIANT[etudiants.length * 2];

            System.arraycopy(
                etudiants, 0,
                tmp, 0,
                etudiants.length
            );

            etudiants = tmp;
        }

        etudiants[nbEtudiants++] = e;
        e.setFiliere(this);
    }

    public void afficherEtudiants() {
        System.out.println(
            "Filière " + nom + " (id=" + id
            + ") → " + nbEtudiants + " étudiants :"
        );

        for (int i = 0; i < nbEtudiants; i++) {
            System.out.println(
                "  • " + etudiants[i].getNom()
                + " " + etudiants[i].getPrenom()
                + " (id=" + etudiants[i].getId() + ")"
            );
        }
    }

    
    public String toString() {
        return "Filiere[id=" + id
                + ", nom=" + nom
                + ", nbEtudiants=" + nbEtudiants
                + "]";
    }
}