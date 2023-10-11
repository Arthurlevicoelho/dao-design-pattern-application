package application;

import java.util.Date;

import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Departament departament = new Departament(1, "Iphone");
		
		
		Seller seller = new Seller(9,"Pedro","pedro@hotmail.com", new Date(),20000.0,departament);
		
		//System.out.println(departament);
		System.out.println(seller);
	}

}
