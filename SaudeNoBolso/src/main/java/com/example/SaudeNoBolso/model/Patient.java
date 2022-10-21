package com.example.SaudeNoBolso.model;

import javax.persistence.*;

@Entity
@Table (name = "PatientSpring")
public class Patient {
    @Id
    @Column (length = 14)
    private String cpf;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false)
    private String birthDate;

    @Column (nullable = false, length = 25)
    private String password;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
