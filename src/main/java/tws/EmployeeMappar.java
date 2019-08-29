package tws;

@Mappar


public interface EmployeeMappar {
	@insert("insert into employee values(#{id},#{name},#{age})")
	void insertEmployee(@RequestBody Employee employee )
	
	@Select("select * from employee")
	List<Employee> getEmployees();
	@Select("select * from employee")
	Employee getEmployees();

}
