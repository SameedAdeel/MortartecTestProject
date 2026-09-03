package com.example.MortartecProject.model;

import java.time.LocalDate;

public class Info {
    private Integer infoId;
    private String name;
    private LocalDate dateOfBirth;
    private String email;
    private String phoneNumber;
    private Double experience;

    public Info() {}

    public Info(Integer infoId, String name, LocalDate dateOfBirth, String email, String phoneNumber, Double experience) {
        this.infoId = infoId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }

    public Integer getInfoId() { return infoId; }
    public void setInfoId(Integer infoId) { this.infoId = infoId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public Double getExperience() { return experience; }
    public void setExperience(Double experience) { this.experience = experience; }
}
