package com.example.SaudeNoBolso.repository;

import com.example.SaudeNoBolso.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository <Patient, String> {

}
