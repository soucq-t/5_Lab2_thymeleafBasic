package com.example.thymeleafbasic.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "tasks")
public class Task {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Past
    @Column(name = "finished_date")
    private LocalDate date;

    @Column(name = "hours_worked")
    private int hoursWorked;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Staff staff;
}
