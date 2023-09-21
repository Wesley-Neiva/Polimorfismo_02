package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Tax;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Tax> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anual = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.println("Health expenditures: ");
				double health = sc.nextDouble();
				list.add(new Individual(name, anual, health));
			}else if (ch == 'c') {
				System.out.print("Number of Employee: ");
				int employee = sc.nextInt();
				list.add(new Company(name, anual, employee));
			}
		}
		sc.close();
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double soma = 0.0;
		for(Tax obj: list) {
			System.out.println(obj.toString());
			soma = soma + obj.imposto();
			
		}
		System.out.println();
		System.out.println("TOTAL TAXES: " + String.format("%.2f", soma));
	}

}
