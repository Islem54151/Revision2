public class Main {
    public static void main(String[] args) {

        Patient p1 = new Patient(123, "Sm", "Jhn", 4);
        Patient p2 = new Patient(222, "De", "Jfh ", 8);
        Patient p3 = new Patient(123, "Sm", "Jhn", 4);


        Medecin m1 = new Medecin(11, "islem", "islem", 1);
        Medecin m2 = new Medecin(2, "is", "iss", 2);


        Hopital hopital = new Hopital();

        hopital.ajouterMedecin(m1);
        hopital.ajouterMedecin(m2);


        hopital.ajouterPatient(m1, p1);
        hopital.ajouterPatient(m2, p2);
        hopital.ajouterPatient(m2, p3);

        hopital.afficherMap();


        ListPatients listPatients = new ListPatients();
        listPatients.ajouterPatient(p2);
        listPatients.ajouterPatient(p1);
        listPatients.ajouterPatient(p3);

        listPatients.afficherPatients();
    }
}
