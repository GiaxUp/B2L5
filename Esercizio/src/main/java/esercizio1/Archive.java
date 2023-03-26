package esercizio1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public abstract class Archive {

	Long ISBNcode;
	String titolo;
	int yearOfPublishing;
	int numberOfPages;

	public Archive(long ISBNCode, String title, int year, int numOfPages) {
		this.ISBNcode = ISBNCode;
		this.titolo = title;
		this.yearOfPublishing = year;
		this.numberOfPages = numOfPages;

	}

}
