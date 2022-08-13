package ru.skypro;

import java.util.Objects;

class Book {
    private String bookName;
    private Author author;
    private int publishingYear;

    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    @Override
    public String toString() {
        return bookName + ": " + author + ": " + publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName) + Objects.hash(author) + Objects.hash(publishingYear);
    }
}

class Author {
    private String firstAuthorName;
    private String lastAuthorName;

    public Author(String firstAuthorName, String lastAuthorName) {
        this.firstAuthorName = firstAuthorName;
        this.lastAuthorName = lastAuthorName;
    }

    public String getFirstAuthorName() {
        return firstAuthorName;
    }

    public String getLastAuthorName() {
        return lastAuthorName;
    }

    @Override
    public String toString() {
        return "Author" + "("+firstAuthorName + ":" + lastAuthorName +")";
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return firstAuthorName.equals(author.firstAuthorName) && lastAuthorName.equals(author.lastAuthorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstAuthorName) + Objects.hash(lastAuthorName);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(new Book("Book1", new Author("Ivanov", "Ivan"), 2022));
        Author author1 = new Author("Иванов", "Иван");
        Author author2 = new Author("Иванов", "Иван");

        Book book1 = new Book("Книга один", author1, 2022);
        Book book2 = new Book("Книга один", author2, 2022);

        System.out.println(author1.equals(author2));
        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

    }
}
