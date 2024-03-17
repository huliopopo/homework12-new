public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Николай", "Гоголь");
        Author author2 = new Author("Александр", "Дюма");
        Book book1 = new Book("Ревизор", author1, 1836);
        Book book2 = new Book("Граф Монте-Кристо", author2, 1844);
        Book book3 = new Book("Ревизор", author1, 8888);
        System.out.println("revizor.getTitle() = " + book1.getTitle());
        System.out.println("revizor.getAuthor() = " + book1.getAuthor());
        System.out.println("revizor.getYear() = " + book1.getYear());

        book1.setYear(8888);
        System.out.println("revizor.getYear() = " + book1.getYear());

        System.out.println(book1);

        if (book1.equals(book3)) {
            System.out.println("Книга такая же");
        } else {
            System.out.println("Книги разные");
        }

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());

        if (author1.equals(author2)) {
            System.out.println("Автот тот же");
        } else System.out.println("Авторы разные");

        }

    }
