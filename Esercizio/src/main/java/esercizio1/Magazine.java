package esercizio1;

public class Magazine extends Archive {
    Enum<Frequency> frequencyOfPublishing;

    public Magazine(Enum<Frequency> frequencyOfPublishing, Long ISBNcode, String titolo, int yearOfPublishing, int numberOfPages) {
        super(ISBNcode, titolo, yearOfPublishing, numberOfPages);
        this.frequencyOfPublishing = frequencyOfPublishing;
    }

    @Override
    public String toString() {
        return "\n" +
                "Title: " + this.titolo + "\n" +
                "Frequency of publishing: " + this.frequencyOfPublishing + "\n" +
                "Number of pages: " + this.numberOfPages + "\n" +
                "Year of publishing: " + this.yearOfPublishing + "\n" +
                "ISBN Code: " + this.ISBNcode + "\n";
    }
}

