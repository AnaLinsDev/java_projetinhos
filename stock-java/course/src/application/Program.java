package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {  
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");	
		product.setName(sc.nextLine());
		System.out.print("Price: ");	
		product.setPrice(sc.nextDouble());
		System.out.print("Quantity in Stock: ");	
		product.setQuantity(sc.nextInt());
		
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addQuantity(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeQuantity(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();

	}

}
