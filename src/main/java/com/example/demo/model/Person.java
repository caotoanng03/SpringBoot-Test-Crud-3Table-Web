package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.websocket.OnError;

import java.util.List;

@Entity
@Table(name="szemely")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nev")
    private String name;
    @Column(name="rendszam")
    private String plateNumber;
    @Column(name="magassag")
    private int height;

    @OneToMany
    @JoinColumn(name="szemelyid")
    private List<Telephone> phoneNumbers;

    @OneToOne
    @JoinColumn(name="rendszam", insertable = false, updatable = false)
    private Vehicle vehicle;

    public List<Telephone> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Telephone> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
