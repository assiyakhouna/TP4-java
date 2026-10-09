
public class main {
    public static void main(String[] args) {

        ETUDIANT e1 = new ETUDIANT("Alami", "Sara");

        e1.ajouterNote(12);
        e1.ajouterNote(15);
        e1.ajouterNote(18);

        e1.afficherNotes();

        System.out.println("Moyenne : " + e1.calculerMoyenne());

        System.out.println(e1);
    }
}

