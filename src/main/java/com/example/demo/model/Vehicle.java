package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="jarmu")
public class Vehicle {
    @Id
    @Column(name="rndszm")
    private String plateNumber;
    @Column(name="marka")
    private String brand;
    @Column(name="szin")
    private String color;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
