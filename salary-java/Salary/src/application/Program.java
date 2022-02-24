package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();

		System.out.print("Name: ");	
		employee.setName(sc.nextLine());
		System.out.print("Gross salary: ");	
		employee.setGrossSalary(sc.nextDouble());
		System.out.print("Tax: ");	
		employee.setTax(sc.nextInt());
		employee.netSalary();
		
		System.out.println("Employee: " + employee);
		
		System.out.print("Which percentage to increase salary? ");	
		employee.IncreaseSalary(sc.nextInt());
		
		System.out.println("Updated data: " + employee);
	
		sc.close();

	}

}
