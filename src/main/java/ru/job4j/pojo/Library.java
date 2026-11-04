package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", 950);
        Book book2 = new Book("Clean code", 456);
        Book book3 = new Book("Java for beginners", 328);
        Book book4 = new Book("Отверженные", 654);

        Book[] books = {book1, book2, book3, book4};
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getTitle() + " - " + books[index].getPages());
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        System.out.println("После того, как поменяли местами книги 0 и 3:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " + book.getPages());
        }

        System.out.println("Вывод книг с именем \"Clean code\":");
        for (int index = 0; index < books.length; index++) {
            if (("Clean code").equals(books[index].getTitle())) {
                System.out.println(books[index].getTitle() + " - " + books[index].getPages());
            }
        }
    }
}
