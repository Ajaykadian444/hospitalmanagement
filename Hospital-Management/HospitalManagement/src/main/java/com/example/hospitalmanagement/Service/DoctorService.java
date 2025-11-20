package com.example.hospitalmanagement.service;

import com.example.hospitalmanagement.entity.Doctor;
import com.example.hospitalmanagement.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository repo;

    public DoctorService(DoctorRepository repo) {
        this.repo = repo;
    }

    public List<Doctor> getAllDoctors() {
        return repo.findAll();
    }

    public Doctor getDoctorById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Doctor saveDoctor(Doctor doctor) {
        return repo.save(doctor);
    }

    public void deleteDoctor(Long id) {
        repo.deleteById(id);
    }
}

