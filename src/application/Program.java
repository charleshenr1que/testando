package application;

import java.util.Scanner;

import entites.Account;
import entites.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account Number: ");
		String accountNumber = sc.nextLine();
		System.out.println("Enter accounte holder: ");
		String name = sc.nextLine();
		System.out.println("Is there initial deposit value: (y/n) ?");
		Account ac1;
		char answer = sc.next().charAt(0);
		switch (answer) {
		case 'y':
			System.out.println("Enter initial deposit value:");
			double value = sc.nextDouble();
			ac1 = new Account(accountNumber, name, value);

			break;

		case 'n':
			ac1 = new Account(accountNumber, name);
			break;
		default:
			ac1 = new Account(accountNumber, name);
		}

		System.out.println("Account data:  ");
		System.out.println(ac1.toString());
		ac1.deposit(5000);
		System.out.println("Account data:  ");
		System.out.println(ac1.toString());
		ac1.toWithdraw(2000);
		ac1.setName("Charles Pacheco");

		System.out.println("Account data:  ");
		System.out.println(ac1.toString());

	}

}
