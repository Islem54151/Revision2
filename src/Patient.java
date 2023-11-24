import java.util.*;

public class Patient {
    private int cin;
    private String nom;
    private String prenom;
    private int numSecuriteSociale;

    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNumSecuriteSociale(int numSecuriteSociale) {
        this.numSecuriteSociale = numSecuriteSociale;
    }

    public int getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getNumSecuriteSociale() {
        return numSecuriteSociale;
    }

    public Patient(int cin, String nom, String prenom, int numSecuriteSociale) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.numSecuriteSociale = numSecuriteSociale;
    }

    public String toString() {
        return "Patient [cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", numSecuriteSociale=" + numSecuriteSociale + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Patient patient = (Patient) obj;
        return cin == patient.cin && numSecuriteSociale == patient.numSecuriteSociale;
    }
}