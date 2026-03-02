package co.edu.uniquindio.application.controller;

import co.edu.uniquindio.application.model.Book;
import co.edu.uniquindio.application.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Ejemplo: GET /api/books/buscar?frase=harry
    @GetMapping("/buscar")
    public List<Book> buscarLibros(@RequestParam String frase) {
        return bookService.buscarPorTituloOFrase(frase);
    }
}