package com.example.demo.repository;

import com.example.demo.model.Telephone;
import org.springframework.data.repository.CrudRepository;

public interface TelephoneRepo extends CrudRepository<Telephone, Integer> {
}
