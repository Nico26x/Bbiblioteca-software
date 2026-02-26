package co.edu.uniquindio.application.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Resena {
    @Getter
    @Setter
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Book book;

    @Column(length = 1000)
    private String comentario;

    private LocalDateTime fechaResena;
}
