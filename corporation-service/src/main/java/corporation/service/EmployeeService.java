package corporation.service;

import corporation.repository.Employee;
import corporation.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee getEmployeeById(Long personId){
        Optional<Employee> optionalById = employeeRepository.findById(personId);
        return optionalById.get();
    }
}
