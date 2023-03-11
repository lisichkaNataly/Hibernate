import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Employee;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) throws SQLException {

            //// Создаем объект класса ДАО
            EmployeeDAO employeeDao = new EmployeeDAOImpl();
            Employee employee1 = new Employee(8,"Darya","Androva","woman",25, 3);

        // Создаем объект
            employeeDao.create(employee1);

        // Получаем объект по id
        System.out.println(employeeDao.getById(8));

        // Получаем полный список объектов

        List<Employee> list = employeeDao.getAllEmployees();

        for (Employee employee : list){
            System.out.println(employee);
        }

        Employee employee2 = new Employee(9,"Ivan","Ivanov","man",30, 1);

            //Изменяем объект
            employeeDao.updateEmployee(employee2);

            //Удаляем объект
            employeeDao.deleteEmployee(employee2);
        }

    }

