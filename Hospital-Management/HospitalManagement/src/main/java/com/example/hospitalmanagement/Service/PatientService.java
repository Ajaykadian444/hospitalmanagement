package com.example.hospitalmanagement.service;

import com.example.hospitalmanagement.entity.Patient;
import com.example.hospitalmanagement.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository repo;

    // Constructor Injection (Recommended by Spring)
    public PatientService(PatientRepository repo) {
        this.repo = repo;
    }

    // Get all patients
    public List<Patient> getAllPatients() {
        return repo.findAll();
    }

    // Get patient by ID
    public Patient getPatientById(Long id) {
        return repo.findById(id).orElse(null);
    }

    // Add or update patient
    public Patient savePatient(Patient patient) {
        return repo.save(patient);
    }

    // Delete patient by ID
    public void deletePatient(Long id) {
        repo.deleteById(id);
    }
}
