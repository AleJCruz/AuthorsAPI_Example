package com.upc.curso.dtos;

import com.upc.curso.entidades.Author;
import lombok.*;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private Long id;
    private String nameBook;
    private LocalDate publicationDateBook;
    private int numberPages;
    private Author author;

}
