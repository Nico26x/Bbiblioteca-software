package co.edu.uniquindio.application.service;

import co.edu.uniquindio.application.model.Book;
import co.edu.uniquindio.application.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> buscarPorTituloOFrase(String frase) {
        return bookRepository.findByTituloContainingIgnoreCase(frase);
    }
}