package ma.enset.tp3hospital;

import ma.enset.tp3hospital.entities.Patient;
import ma.enset.tp3hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;



@SpringBootApplication
public class Tp3HospitalApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public Tp3HospitalApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(Tp3HospitalApplication.class, args);
    }
//en utilisant un constructeur sans parametres
//        Patient patient = new Patient();
//        patient.setId(null);
//        patient.setNom("HAFSA");
//        patient.setMalade(false);
//        patient.setScore(56);
//        patient.setDateNaissance(new Date());
//
//        //en utilisant contructeur avec parametres
//        Patient patient1=new Patient(null,"Khaoula",new Date(),false,6758);
//
//        //en utilisant builder
//        Patient patient2=Patient.builder()
//                .nom("HAFSA")
//                .dateNaissance(new Date())
//                .score(678)
//                .malade(true)
//                .build();

    public void run(String... args) throws Exception {
        this.patientRepository.save(new Patient((Long)null, "hafsa", new Date(), false, 6758));
        this.patientRepository.save(new Patient((Long)null, "safae", new Date(), false, 746));
        this.patientRepository.save(new Patient((Long)null, "aya", new Date(), true, 74673));
    }
}
