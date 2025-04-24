/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity4_oop;

/**
 *
 * @author Malilong
 */
public class BankTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1234", 40000.0);
        BankAccount account2 = new BankAccount("5678", 9500.0);
        
        System.out.println("Before Transfer:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        Bank bank = new Bank();

        bank.transferMoney(account1, account2, 670.0);

        System.out.println("\nAfter Transfer:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
    }
    
}
