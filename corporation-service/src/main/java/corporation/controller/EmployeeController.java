package corporation.controller;

import corporation.repository.Employee;
import corporation.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public Employee getEmployeeById(Long personId){
        Employee employee = employeeService.getEmployeeById(personId);
        return employee;
    }

}
