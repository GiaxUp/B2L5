package esercizio1;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Catalogue {

	public Catalogue() {
	}

	List<Archive> myCatalogue = new ArrayList<Archive>();

	// Aggiunta di un elemento al catalogo
	public void addToCat(Archive general) {
		this.myCatalogue.add(general);
	}

	// Eliminazione tramite ISBN
	public void deleteWithISBN(Long ISBN) {

		List<Archive> newCatalogue = myCatalogue.stream().filter(x -> !x.ISBNcode.equals(ISBN))
				.collect(Collectors.toList());
		myCatalogue = newCatalogue;

	}

	// Ricerca tramite ISBN
	public void searchWithISBN(Long ISBN) {

		List<Archive> newCatalogue = myCatalogue.stream().filter(x -> x.ISBNcode.equals(ISBN))
				.collect(Collectors.toList());
		System.out.println(newCatalogue);

	}

	// Ricerca tramite anno di pubblicazione
	public void searchYear(int myear) {

		List<Archive> newCatalogue = myCatalogue.stream().filter(x -> x.yearOfPublishing == myear)
				.collect(Collectors.toList());
		System.out.println(newCatalogue);

	}

	// Ricerca tramite autore
	public void searchByAuthor(String author) {
		List<Book> booksByAuthor = myCatalogue.stream().filter(x -> x instanceof Book).map(y -> (Book) y)
				.filter(w -> w.author.equalsIgnoreCase(author) || w.author.contains(author)).limit(10)
				.collect(Collectors.toList());

		if (booksByAuthor.isEmpty()) {
			System.out.println("Non ci sono libri dell'autore cercato nel catalogo.");
		} else {
			System.out.println("Libri dell'autore " + author + ":");
			for (Book book : booksByAuthor) {
				System.out.println(book);
			}
		}
	}

	// Creazione del file Catalogo.txt
	public static void writeFile(Catalogue catalogue) throws IOException {

		File myCatalogueFile = new File("Catalogo.txt");
		FileWriter myFW = new FileWriter(myCatalogueFile);
		PrintWriter myPW = new PrintWriter(myFW);

		for (Archive archive : catalogue.myCatalogue) {
			myPW.println(archive.toString());
		}

		myPW.close();
	}

	// Lettura del file Catalogo.txt
	public static void readFile(Catalogue catalogue) throws IOException {

		File file1 = new File("Catalogo.txt");
		String readString = FileUtils.readFileToString(file1, "UTF-8");
		System.out.println(readString);

	}

}
