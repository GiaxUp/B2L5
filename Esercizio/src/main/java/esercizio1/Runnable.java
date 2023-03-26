package esercizio1;

import java.io.IOException;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Runnable {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] Args) {
		// Books
		Book book_0 = new Book("Stephen King", Genere.Horror, 20000l, "The Outsider", 2018, 560);
		Book book_1 = new Book("J.K. Rowling", Genere.Fantasy, 20001l, "Fantastic Beasts and Where to Find Them", 2001,
				128);
		Book book_2 = new Book("Malcolm Gladwell", Genere.SelfHelp, 20002l, "The Tipping Point", 2000, 301);
		Book book_3 = new Book("Donna Tartt", Genere.Mystery, 20003l, "The Goldfinch", 2013, 771);
		Book book_4 = new Book("Ta-Nehisi Coates", Genere.Biography, 20004l, "Between the World and Me", 2015, 176);
		Book book_5 = new Book("Margaret Atwood", Genere.Dystopian, 20005l, "The Handmaid's Tale", 1985, 311);
		Book book_6 = new Book("Toni Morrison", Genere.LiteraryFiction, 20006l, "Beloved", 1987, 321);
		Book book_7 = new Book("Yuval Noah Harari", Genere.History, 20007l, "Sapiens: A Brief History of Humankind",
				2011, 443);
		Book book_8 = new Book("Michelle Obama", Genere.Memoir, 20008l, "Becoming", 2018, 448);
		// Magazines
		Magazine magazine_0 = new Magazine(Frequency.Monthly, 20100l, "Wired", 1993, 112);
		Magazine magazine_1 = new Magazine(Frequency.Weekly, 20101l, "The New Yorker", 1925, 96);
		Magazine magazine_2 = new Magazine(Frequency.Monthly, 20102l, "Architectural Digest", 1920, 160);
		Magazine magazine_3 = new Magazine(Frequency.Weekly, 20103l, "Sports Illustrated", 1954, 56);
		Magazine magazine_4 = new Magazine(Frequency.Monthly, 20104l, "National Review", 1955, 72);
		Magazine magazine_5 = new Magazine(Frequency.Biannual, 20105l, "Dwell", 2000, 88);
		Magazine magazine_6 = new Magazine(Frequency.Weekly, 20106l, "The Economist", 1843, 88);
		Magazine magazine_7 = new Magazine(Frequency.Monthly, 20107l, "Bon Appétit", 1956, 96);
		Magazine magazine_8 = new Magazine(Frequency.Weekly, 20108l, "Rolling Stone", 1967, 72);

		Catalogue myCatalogue = new Catalogue();
		// Aggiungo Books e Magazines presenti sopra nel catalogo
		myCatalogue.addToCat(book_0);
		myCatalogue.addToCat(book_1);
		myCatalogue.addToCat(book_2);
		myCatalogue.addToCat(book_3);
		myCatalogue.addToCat(book_4);
		myCatalogue.addToCat(book_5);
		myCatalogue.addToCat(book_6);
		myCatalogue.addToCat(book_7);
		myCatalogue.addToCat(book_8);
		myCatalogue.addToCat(magazine_0);
		myCatalogue.addToCat(magazine_1);
		myCatalogue.addToCat(magazine_2);
		myCatalogue.addToCat(magazine_3);
		myCatalogue.addToCat(magazine_4);
		myCatalogue.addToCat(magazine_5);
		myCatalogue.addToCat(magazine_6);
		myCatalogue.addToCat(magazine_7);
		myCatalogue.addToCat(magazine_8);

		// Rimozione di un elemento dato un codice ISBN
//		myCatalogue.deleteWithISBN(20000l);
//		myCatalogue.deleteWithISBN(20001l);
//		myCatalogue.deleteWithISBN(20002l);
//		myCatalogue.deleteWithISBN(20003l);
//		myCatalogue.deleteWithISBN(20004l);
//		myCatalogue.deleteWithISBN(20005l);

		// Ricerca tramite ISBN
		System.out.println("Elementi cercati tramite ISBN (4):");
		myCatalogue.searchWithISBN(20000l);
		myCatalogue.searchWithISBN(20001l);
		myCatalogue.searchWithISBN(20002l);
		myCatalogue.searchWithISBN(20003l);

		// Ricerca tramite anno di pubblicazione
		System.out.println("Elementi cercati tramite anno di pubblicazione (5):");
		myCatalogue.searchYear(1993);
		myCatalogue.searchYear(1955);
		myCatalogue.searchYear(2013);
		myCatalogue.searchYear(2018);

		// Ricerca tramite autore
		System.out.println("Elementi cercati tramite autore (4):");
		myCatalogue.searchByAuthor("Stephen King");
		myCatalogue.searchByAuthor("Donna Tartt");
		myCatalogue.searchByAuthor("Michelle Obama");
		myCatalogue.searchByAuthor("Yuval Noah Harari");

		// Salvataggio su disco dell'archivio
		try {
			Catalogue.writeFile(myCatalogue);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Caricamento dal disco dell'archivio
		try {
			Catalogue.readFile(myCatalogue);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}