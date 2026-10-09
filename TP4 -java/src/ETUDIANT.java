

public class ETUDIANT {

    private static int compteur = 0;

    private int id;
    private String nom;
    private String prenom;
    private double[] notes;
    private int nombreNotes;

    public ETUDIANT(String nom, String prenom) {
        compteur++;
        this.id = compteur;
        this.nom = nom;
        this.prenom = prenom;
        this.notes = new double[2];
        this.nombreNotes = 0;
    }

    public void ajouterNote(double note) {

        if (nombreNotes == notes.length) {
            double[] nouveauTableau = new double[notes.length * 2];

            for (int i = 0; i < notes.length; i++) {
                nouveauTableau[i] = notes[i];
            }

            notes = nouveauTableau;
        }

        notes[nombreNotes] = note;
        nombreNotes++;
    }

    public double calculerMoyenne() {

        if (nombreNotes == 0) {
            return 0;
        }

        double somme = 0;

        for (int i = 0; i < nombreNotes; i++) {
            somme += notes[i];
        }

        return somme / nombreNotes;
    }

    public void afficherNotes() {

        System.out.print("Notes de " + prenom + " " + nom + " : ");

        for (int i = 0; i < nombreNotes; i++) {
            System.out.print(notes[i] + " ");
        }

        System.out.println();
    }

    
    public String toString() {
        return "ID : " + id
                + ", Nom : " + nom
                + ", Prenom : " + prenom
                + ", Moyenne : " + calculerMoyenne();
    }
}