package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill costumer = new Bill();
		
		System.out.print("Sexo: ");
		costumer.gender = sc.next().charAt(0);
		while(costumer.gender != 'F' && costumer.gender != 'f' && costumer.gender != 'M' && costumer.gender != 'm') {
			System.out.print("Valor inválido. Por favor insira F ou M: ");
			costumer.gender = sc.next().charAt(0);
		}
		System.out.print("Quantidade de cervejas: ");
		costumer.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		costumer.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		costumer.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f\n", costumer.feeding());
		if(costumer.cover() == 0.0) {
			System.out.println("Isento de couvert");
		}else {
			System.out.printf("Couvert = R$ %.2f\n", costumer.cover());			
		}
		System.out.printf("Ingresso = R$ %.2f\n", costumer.ticket());
		
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f\n", costumer.total());
		
		sc.close();
		
	}

}
