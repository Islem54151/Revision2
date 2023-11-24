import java.util.*;
public class Medecin implements Comparable<Medecin>  {

    public int cin;
    public String nom;
    public String prenom;
    public  int numOrdre;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNumOrdre(int numOrdre) {
        this.numOrdre = numOrdre;
    }

    public Medecin(int cin, String nom, String prenom, int numOrdre) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.numOrdre = numOrdre;
    }

    public int getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNumOrdre() {
        return numOrdre;
    }
    public String toString() {
        return "Medecin [cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", numOrdre=" + numOrdre + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medecin medecin = (Medecin) o;
        return cin == medecin.cin && numOrdre == medecin.numOrdre && Objects.equals(nom, medecin.nom) && Objects.equals(prenom, medecin.prenom);
    }
    public int compareTo(Medecin other) {
        // Implement comparison logic based on your requirements
        // For example, comparing based on the cin or numOrdre
        return Integer.compare(this.cin, other.cin);
    }
}
