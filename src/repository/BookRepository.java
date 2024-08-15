package repository;

import entity.Book;

import java.util.List;

public interface BookRepository {
    List<Book> get();
    void create(Book book);
    void update(int id, Book book);
    void delete(int id);
}
