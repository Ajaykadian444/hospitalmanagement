package service;


import entity.Appointment;
import repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    /**
     * Save or update an appointment.
     *
     * @param appointment the appointment entity to be saved or updated
     * @return the saved appointment entity
     */
    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    /**
     * Retrieve an appointment by its ID.
     *
     * @param id the ID of the appointment to retrieve
     * @return an Optional containing the appointment if found, otherwise empty
     */
    public Optional<Appointment> getAppointmentById(Long id) {
        return appointmentRepository.findById(id);
    }

    /**
     * Retrieve all appointments.
     *
     * @return a list of all appointments
     */
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    /**
     * Delete an appointment by its ID.
     *
     * @param id the ID of the appointment to be deleted
     */
    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }

    // Add custom query methods if needed
    // For example:
    // public List<Appointment> findAppointmentsByDoctorId(Long doctorId) {
    //     return appointmentRepository.findByDoctorId(doctorId);
    // }
}