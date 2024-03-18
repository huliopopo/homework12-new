public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return '\'' + title + "', " + author + ", " + year;
    }

    @Override
    public boolean equals(Object other) {
        if (getClass() != other.getClass()) {
            System.out.println("Классы объектов разные");
            return false;
        }
        Book book = (Book) other;
        return title.equals(book.title) && author.equals(book.author) && this.year == book.year;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author, year);
    }
}



