package com.upc.curso.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity //Agnóstica
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nameAuthor", length = 60, nullable = false)
    private String nameAuthor;
    private LocalDate birthDateAuthor;
    @Column(name = "emailAuthor",length = 35,nullable = false)
    private String emailAuthor;

}
