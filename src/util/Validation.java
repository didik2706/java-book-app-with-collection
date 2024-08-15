package util;

import entity.Book;
import exception.ValidationException;

public class Validation {
    public static void validate(Book book) throws ValidationException {
        if (book.getTitle().isEmpty()) {
            throw new ValidationException("Title cannot be empty");
        } else if (book.getTitle().isBlank()) {
            throw new ValidationException("Title cannot be blank");
        } else if (book.getAuthor().isEmpty()) {
            throw new ValidationException("Author cannot be empty");
        } else if (book.getAuthor().isBlank()) {
            throw new ValidationException("Author cannot be blank");
        }
    }
}
