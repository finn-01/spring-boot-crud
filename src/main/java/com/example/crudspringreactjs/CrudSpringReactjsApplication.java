package com.example.crudspringreactjs;

import com.example.crudspringreactjs.model.Employee;
import com.example.crudspringreactjs.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringReactjsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringReactjsApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
//        Employee employee = new Employee();
//        employee.setFirstName("Finn");
//        employee.setLastName("Nguyen");
//        employee.setEmailId("finnnguyen@gmail.com");
//        employeeRepository.save(employee);
//
//        Employee employee1 = new Employee();
//        employee1.setFirstName("Finn1");
//        employee1.setLastName("Nguyen1");
//        employee1.setEmailId("finnnguyen1@gmail.com");
//        employeeRepository.save(employee1);

    }
}
