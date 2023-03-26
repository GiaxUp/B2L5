package esercizio1;

import lombok.Getter;

@Getter
public class Book extends Archive {
    String author;
    Enum<Genere> genre;

    public Book(String author, Enum<Genere> genre, Long ISBNcode, String titolo, int yearOfPublishing, int numberOfPages) {
        super(ISBNcode, titolo, yearOfPublishing, numberOfPages);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "\n" +
                "Title: " + this.titolo + "\n" +
                "Author: " + this.author + "\n" +
                "Genre: " + this.genre + "\n" +
                "Number of pages: " + this.numberOfPages + "\n" +
                "Year of publishing: " + this.yearOfPublishing + "\n" +
                "ISBN Code: " + this.ISBNcode + "\n";
    }
}

