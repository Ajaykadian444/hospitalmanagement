package service;

import entity.Hospital;
import repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalService {

    private final HospitalRepository hospitalRepository;

    @Autowired
    public HospitalService(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    public Hospital saveHospital(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    public Optional<Hospital> getHospitalById(Long id) {
        return hospitalRepository.findById(id);
    }

    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }

    public void deleteHospital(Long id) {
        hospitalRepository.deleteById(id);
    }
}