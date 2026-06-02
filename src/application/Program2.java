package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		List<Department> list = new ArrayList<>();
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = new Department();		
		
		/*System.out.println("\n=== TEST 1: Department insert ====");
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());*/
		
		System.out.println("\n=== TEST 2: Department Update ====");
		department = departmentDao.findById(2);
		department.setName("Food");
		departmentDao.update(department);
		System.out.println("Upadate completed" + department);
		
		System.out.println("=== TEST 4: Department findById ====");
		department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n=== TEST 3: Department findAll ====");
		list = departmentDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		}
		
		
		
	}

}
