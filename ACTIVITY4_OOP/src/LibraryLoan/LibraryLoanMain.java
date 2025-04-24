/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryLoan;



/**
 *
 * @author Malilong
 */
public class LibraryLoanMain {

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Human Mind", "Fyodor Dostoyevski", 30);
        Book book2 = new Book("Basta Kuan", "Dazai Osamou", 12);
        Book book3 = new Book("KinbuhingLife", "Jumss Ski", 34);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Before Loan:");
        library.displayLibrary();

        library.loanBook(book1, 15);
        library.loanBook(book2, 6);
        library.loanBook(book3, 17);

        System.out.println("\nAfter Loan:");
        library.displayLibrary();
    }
}

