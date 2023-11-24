import java.util.*;
import java.util.stream.Collectors;

public class ListPatients implements InterfacePatient {
    private List<Patient> listP;

    public ListPatients() {
        listP = new ArrayList<>();
    }

    public void ajouterPatient(Patient p) {
        if (listP.stream().noneMatch(existingPatient -> existingPatient.equals(p))) {
            listP.add(p);
        } else {
            System.out.println(" patient existe déjà");
        }
    }

    public void supprimerPatient(Patient p) {
        listP = listP.stream()
                .filter(patient -> patient.getCin() != p.getCin())
                .collect(Collectors.toList());
    }

    public boolean rechercherPatient(Patient p) {
        return listP.stream().anyMatch(existingPatient -> existingPatient.equals(p));
    }

    public boolean rechercherPatient(int cin) {
        return listP.stream().anyMatch(p -> p.getCin() == cin);
    }

    public void afficherPatients() {
        listP.forEach(System.out::println);
    }

    public void trierPatientsParNom() {
        listP.sort(Comparator.comparing(Patient::getNom));
    }
}
