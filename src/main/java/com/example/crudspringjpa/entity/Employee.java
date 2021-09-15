package com.example.crudspringjpa.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
}
