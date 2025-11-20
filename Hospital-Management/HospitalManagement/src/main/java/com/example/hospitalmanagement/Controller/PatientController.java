package com.example.hospitalmanagement.Controller;

import com.example.hospitalmanagement.entity.Patient;
import com.example.hospitalmanagement.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }


    @PostMapping
    public Patient create(@RequestBody Patient patient) {
        return service.savePatient(patient);
    }

    @GetMapping("/{id}")
    public Patient getById(@PathVariable Long id) {
        return service.getPatientById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deletePatient(id);
    }
}
