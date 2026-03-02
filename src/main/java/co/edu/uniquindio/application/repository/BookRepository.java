package co.edu.uniquindio.application.repository;

import co.edu.uniquindio.application.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    // Busca por coincidencia parcial en el título (sin importar mayúsculas/minúsculas)
    List<Book> findByTituloContainingIgnoreCase(String frase);
}