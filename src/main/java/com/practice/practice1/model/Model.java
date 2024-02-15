package com.practice.practice1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Practice1")
public class Model {
    public Model() {

    }
    public Model(Long id, String message) {
        super();
        this.id = id;
        this.message = message;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "message", length = 500)
    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
