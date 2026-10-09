
package ma.projet.bean;

public class Categorie {
    private int id;
    private String libelle;
    private String code;

    private static int compteur = 1;

    public Categorie(String libelle, String code) {
        this.id = compteur++;
        this.libelle = libelle;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    
    public String toString() {
        return id + " " + libelle + " " + code;
    }
}