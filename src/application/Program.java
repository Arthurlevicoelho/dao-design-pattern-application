package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();

		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n================= Teste department findByDepartment =============== \n");
		Department department = new Department(2, null);

		List<Seller> list = sellerDao.finByDepartment(department);
		for (Seller s : list) {
			System.out.println(s);

		}

		System.out.println("\n=========== Teste department findAll ========== \n");

		list = sellerDao.findAll();
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n=========== Teste department insert ========== \n");
		Seller newSeller = new Seller(null, "Arthur", "Arthurlevi@gmail.com", new Date(),2000.00,department);
		//sellerDao.insert(newSeller);
		//System.out.println("Inserted! New id:"+ newSeller.getId());
		
		
		System.out.println("\n=========== Teste department  ========== \n");
		
		seller = sellerDao.findById(1);
		seller.setName("João Pedro");
		sellerDao.update(seller);
		System.out.println("Update Completed!!!");
		
		System.out.println("\n=========== Teste department  ========== \n");
		System.out.println("Enter Id for delete: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Seller of Id:" + id +" deleted!!!");
		
		
		sc.close();
		}

}
