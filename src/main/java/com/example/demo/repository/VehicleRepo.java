package com.example.demo.repository;

import com.example.demo.model.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepo extends CrudRepository<Vehicle, String> {
}
