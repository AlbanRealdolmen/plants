package com.example.plants.model;

import javax.persistence.*;

@Entity
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private double price;

    @Column(name = "LATINNAME")
    private String latinName;

    public Long getId() {
        return id;
    }

}
