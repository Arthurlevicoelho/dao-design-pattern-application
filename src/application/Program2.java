package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		System.out.println("=============TESTE ALLDEPARTMENT========");
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		List<Department> list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n=============TESTE ALLDEPARTMENT========\n");
		
		Department department = departmentDao.findById(2);
		System.out.println(department);

	}

}
