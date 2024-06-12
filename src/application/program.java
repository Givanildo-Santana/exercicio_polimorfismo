package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		
		int nProduct = sc.nextInt();
		sc.nextLine();
		
		List<Product> products = new ArrayList<>();
		
		for (int x = 1; x <= nProduct; x++) {
			String productName;
			Double productPrice;
			System.out.println("Product #"+x+" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char tProduct = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			productName = sc.nextLine();
			System.out.print("Price: ");
			productPrice = sc.nextDouble();
			sc.nextLine();
			
			if (tProduct == 'c' ) {
				
				Product product = new Product(productName, productPrice);
				products.add(product);
				
			}else if (tProduct == 'u') {
				
				System.out.print("Manufactured date (DD/MM/YYYY): ");
				Date manufaturedDate = sdf.parse(sc.next());
				sc.nextLine();
				
				UsedProduct product = new UsedProduct(productName,productPrice,manufaturedDate);				
				products.add(product);
				
			}else if (tProduct =='i'){
				
				System.out.print("Customs fee: ");
				Double cf = sc.nextDouble();
				sc.nextLine();
				
				ImportedProduct product = new ImportedProduct(productName, productPrice,cf);
				products.add(product);
				
			}else {
				System.out.println("COMANDO NÂO RECONHECIDO!");
			}
				
		}
		
	System.out.println("\nPRICE TAGS:");
	
	for(Product p:products) {
		System.out.println(p.priceTag());
	}

	}

}
