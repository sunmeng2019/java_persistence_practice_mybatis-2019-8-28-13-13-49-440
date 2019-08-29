package tws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@Mappar
public class EmployeeControll {
	@Autowired
	 private EmployeeMapper employeeMapper;
	 
	  @PostMapping
	  @ResponseStatus(HttpStatus.CREATED)
	  public void addEmployee(@RequestBody Employee employee) {
	   employeeMapper.insertEmpployee(employee);
	  }
	  
	  @GetMapping
	  @ResponseStatus(HttpStatus.OK)
	  public List getEmployee() {
	   List<Employee> employee = EmployeeMappar.getEmployees();
	   return employee;
	  }