package service;


import entity.Patient;
import repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    /**
     * Save or update a patient.
     *
     * @param patient the patient entity to be saved or updated
     * @return the saved patient entity
     */
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    /**
     * Retrieve a patient by its ID.
     *
     * @param id the ID of the patient to retrieve
     * @return an Optional containing the patient if found, otherwise empty
     */
    public Optional<Patient> getPatientById(Long id) {
        return patientRepository.findById(id);
    }

    /**
     * Retrieve all patients.
     *
     * @return a list of all patients
     */
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    /**
     * Delete a patient by its ID.
     *
     * @param id the ID of the patient to be deleted
     */
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}