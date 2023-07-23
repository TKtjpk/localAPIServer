package com.example.demo;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface DataRepository extends CrudRepository<Temperatures, Integer> {
    Iterable<Temperatures> findTemperaturesByTempIsLessThan(double temp);
    Iterable<Temperatures> findTemperaturesByTempIsGreaterThan(double temp);
    Iterable<Temperatures> findTemperaturesByTempBetween(double temp1, double temp2);
    Iterable<Temperatures> findTemperaturesByIdBefore(String date);
    Iterable<Temperatures> findTemperaturesByIdAfter(String date);
    Iterable<Temperatures> findTemperaturesByIdBetween(String date1, String date2);
}