package service;

import entity.Book;
import exception.ValidationException;
import repository.BookRepository;
import util.Validation;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void getAllBook() {
        int no = 1;
        for (var book : bookRepository.get()) {
            System.out.println(no++ + ". " + book.getTitle() + " | Author : " + book.getAuthor());
        }
    }

    @Override
    public void createBook(Book book) {
        try {
            Validation.validate(book);

            bookRepository.create(book);
        } catch (ValidationException exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void updateBook(int id, Book book) {
        try {
            Validation.validate(book);

            bookRepository.update(id, book);
        } catch (ValidationException exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void deleteBook(int id) {
        bookRepository.delete(id);
    }
}
