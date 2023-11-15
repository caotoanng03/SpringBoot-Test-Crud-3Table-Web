package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="telefon")
public class Telephone {
    @Id
    private int id;
    @Column(name="szemelyid")
    private int personId;
    @Column(name="szam")
    private String phoneNumber;

    public int getId() {
        return id;
    }

    public int getPersonId() {
        return personId;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
