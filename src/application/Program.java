package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {
	
	// Programa para cadastrar o name, price e quantity dos produtos

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products prod = new Products();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		prod.name = sc.nextLine();
		System.out.println("Price: ");
		prod.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		prod.quantity = sc.nextInt();
		 
		System.out.println("Product data: " + prod.toString());
		
		System.out.println("");
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		prod.addProducts(quantity);
		
		System.out.println("");
		System.out.println("Product data: " + prod.toString());
		
		System.out.println("");
		System.out.println("Enter the number of products to be removed in stock: ");
		 quantity = sc.nextInt();
		 prod.removeProduct(quantity);
		
		System.out.println("");
		System.out.println("Product data: " + prod.toString());
		
       sc.close();
	}

}
