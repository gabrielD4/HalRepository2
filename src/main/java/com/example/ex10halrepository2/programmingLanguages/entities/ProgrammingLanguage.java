package com.example.ex10halrepository2.programmingLanguages.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class ProgrammingLanguage {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String name;

    private LocalDate firstAppearance;
    @Column(nullable = false)
    private String inventor;

}
