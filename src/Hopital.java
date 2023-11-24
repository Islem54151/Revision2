import java.util.*;
public class Hopital {
    public Map<Medecin, ListPatients> medecinPatiens;

    public Hopital() {
        medecinPatiens = new TreeMap<>();
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatiens.put(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatiens.containsKey(m)) {
            medecinPatiens.get(m).ajouterPatient(p);
        } else {
            System.out.println("pas de patient ");
        }
    }

    public void afficherMap() {
        medecinPatiens.forEach((medecin, listPatients) -> {
            System.out.println("Medecin: " + medecin);
            System.out.println("Patients: ");
            listPatients.afficherPatients();
            System.out.println("------------------------");
        });
    }

    public void afficherMedcinPatients(Medecin m) {
        if (medecinPatiens.containsKey(m)) {
            System.out.println("Patient " + m.getNom() + " " + m.getPrenom());
            medecinPatiens.get(m).afficherPatients();
        } else {
            System.out.println("pas de Medecinpatient");
        }
    }
}