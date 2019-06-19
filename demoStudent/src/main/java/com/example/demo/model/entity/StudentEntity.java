package com.example.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class StudentEntity {
    private int id;
    private int scholarship;
    private long university;
    private long person;

    @ManyToOne
    PersonEntity personEntity;
}
