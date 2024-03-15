public class Main {
    public static void main(String[] args) {
        Author nikolaiGogol = new Author("Николай", "Гоголь");
        Author alexDuma = new Author("Александр", "Дюма");
        Book revizor = new Book("Ревизор", nikolaiGogol, 1836);
        Book graphMonteKristo = new Book("Граф Монте-Кристо", alexDuma, 1844);
        System.out.println("revizor.getTitle() = " + revizor.getTitle());
        System.out.println("revizor.getAuthor() = " + revizor.getAuthor());
        System.out.println("revizor.getYear() = " + revizor.getYear());

        revizor.setYear(1888);
        System.out.println("revizor.getYear() = " + revizor.getYear());

    }
}