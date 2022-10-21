package com.example.SaudeNoBolso.controller;

import com.example.SaudeNoBolso.model.Patient;
import com.example.SaudeNoBolso.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value = "/apiPatient")
public class PatientController {
    @Autowired
    PatientRepository patientRepository;

    @GetMapping (value = "/all")
    public List<Patient> findAll(){
        return patientRepository.findAll();
    }

    @GetMapping (value = "/patient/{cpf}")
    public Optional<Patient> searchByCpf(@PathVariable (value = "cpf") String cpf){
        return patientRepository.findById(cpf);
    }

    @PostMapping (value = "/insertPatient")
    public void insertPatient(@RequestBody Patient patient){
        patientRepository.save(patient);
    }

    @PutMapping (value = "/updatePatient")
    public void updatePatient(@RequestBody Patient patient){
        patientRepository.save(patient);
    }

    @DeleteMapping (value = "/deletePatient")
    public void deletePatient(@RequestBody Patient patient){
        patientRepository.delete(patient);
    }
}
