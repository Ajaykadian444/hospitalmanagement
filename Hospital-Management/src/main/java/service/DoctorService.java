package service;



import entity.Doctor;
import repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    /**
     * Save or update a doctor.
     *
     * @param doctor the doctor entity to be saved or updated
     * @return the saved doctor entity
     */
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    /**
     * Retrieve a doctor by its ID.
     *
     * @param id the ID of the doctor to retrieve
     * @return an Optional containing the doctor if found, otherwise empty
     */
    public Optional<Doctor> getDoctorById(Long id) {
        return doctorRepository.findById(id);
    }

    /**
     * Retrieve all doctors.
     *
     * @return a list of all doctors
     */
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    /**
     * Delete a doctor by its ID.
     *
     * @param id the ID of the doctor to be deleted
     */
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

    // Add custom query methods if needed
    // For example:
    // public List<Doctor> findDoctorsBySpecialty(String specialty) {
    //     return doctorRepository.findBySpecialty(specialty);
    // }
}