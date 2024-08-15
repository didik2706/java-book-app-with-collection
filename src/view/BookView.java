package view;

import entity.Book;
import service.BookService;
import util.Input;

public class BookView {
    private BookService bookService;

    public BookView(BookService bookService) {
        this.bookService = bookService;
    }

    public void getAllBooks() {
        System.out.println("==== List of Books ====");
        bookService.getAllBook();

        System.out.println("==== Menu ====");
        System.out.println("1. Get All Book");
        System.out.println("2. Create Book");
        System.out.println("3. Update Book");
        System.out.println("4. Delete Book");
        System.out.println("5. Exit");
        String choose = Input.getInput("Please input menu");

        while (true) {
            switch (choose) {
                case "1" -> getAllBooks();
                case "2" -> createBook();
                case "3" -> updateBook();
                case "4" -> deleteBook();
                case "5" -> System.exit(1);
                default -> getAllBooks();
            }
        }
    }

    public void createBook() {
        System.out.println("==== Create Book ====");
        String title = Input.getInput("Input your book title");
        String author = Input.getInput("input your book author");

        bookService.createBook(new Book(title, author));
        System.out.println("Book created successfully");
        getAllBooks();
    }

    public void updateBook() {
        System.out.println("==== Update Book ====");
        String id = Input.getInput("Input your book ID");
        String title = Input.getInput("Input your book title");
        String author = Input.getInput("input your book author");

        bookService.updateBook(Integer.parseInt(id), new Book(title, author));
        System.out.println("Book updated successfully");
        getAllBooks();
    }

    public void deleteBook() {
        System.out.println("==== Delete Book ====");
        String id = Input.getInput("Input your book ID");

        bookService.deleteBook(Integer.parseInt(id));
        System.out.println("Book deleted successfully");
        getAllBooks();
    }
}
