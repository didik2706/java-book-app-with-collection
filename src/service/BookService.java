package service;

import entity.Book;

import java.util.List;

public interface BookService {
    void getAllBook();
    void createBook(Book book);
    void updateBook(int id, Book book);
    void deleteBook(int id);
}
