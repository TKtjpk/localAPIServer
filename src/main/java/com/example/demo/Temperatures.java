package com.example.demo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "temp_mon")
@Entity // This tells Hibernate to make a table out of this class
public class Temperatures {

    @Id
    @Column(name = "id", nullable = false, columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private String id;

    @Column(name = "temp", nullable = false, columnDefinition = "DECIMAL (5, 2)")
    private double temp;
}