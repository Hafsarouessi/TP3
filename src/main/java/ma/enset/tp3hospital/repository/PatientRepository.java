package ma.enset.tp3hospital.repository;

import ma.enset.tp3hospital.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Page<Patient> findByNomContains(String keyword,Pageable pageable);

    //deuxieme maniere
//    @Query("select p from Patient p where p.nom like :x")
//    Page<Patient> chercher(@Param("x") String keyword);
}
