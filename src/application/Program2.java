package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=============TESTE ALLDEPARTMENT========");
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		List<Department> list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n=============TESTE FINDBYID========\n");
		
		Department department = departmentDao.findById(2);
		System.out.println(department);

		System.out.println("\n=============TESTE UPDATE========\n");
		
		department = departmentDao.findById(1);
		department.setName("Books");
		departmentDao.update(department);
		System.out.println("Update Completed!!!");
		
		System.out.println("\n=============TESTE INSERT========\n");
		Department dep = new Department(null,"Computers");
		//departmentDao.insert(dep);
		System.out.println("Insert completed!!!");
		
		System.out.println("\n=============TESTE DELETE========\n");
		System.out.print("Digite o id que deseja deletar: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("O departamento de id: " + id + " foi deletado com sucesso");
	}

}
