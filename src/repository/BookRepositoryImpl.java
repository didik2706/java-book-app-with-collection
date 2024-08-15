package repository;

import entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BookRepositoryImpl implements BookRepository {
    private List<Book> book;

    public BookRepositoryImpl(Integer size) {
        this.book = new ArrayList<>(size);
    }

    @Override
    public List<Book> get() {
        return book;
    }

    @Override
    public void create(Book book) {
        this.book.add(book);
    }

    @Override
    public void update(int id, Book book) {
        try {
            this.book.set(id - 1, book);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Book with id " + id + " not found");
        }
    }

    @Override
    public void delete(int id) {
        try {
            this.book.remove(id - 1 );
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Book with id " + id + " not found");
        }
    }
}
