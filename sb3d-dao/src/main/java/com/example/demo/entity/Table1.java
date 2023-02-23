package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Table1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String someCol1;
    Integer someCol2;
    Boolean someCol3;
    @Column(columnDefinition = "TEXT")
    String someCol4;
}
