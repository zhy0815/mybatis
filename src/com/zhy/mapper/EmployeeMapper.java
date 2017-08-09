package com.zhy.mapper;

import java.util.HashMap;
import java.util.List;

import com.zhy.model.Employee;

public interface EmployeeMapper {
	List<Employee> selectEmployeeByIdLike(HashMap<String, Object> params);
	List<Employee> selectEmployeeByLoginLike(HashMap<String, Object> params);
	List<Employee> selectEmployeeChoose(HashMap<String, Object> params);
	List<Employee> selectEmployeeLike(HashMap<String, Object> params);
	Employee selectEmployeeWithId(Integer id);
	void updateEmployeeIfNecessary(Employee e);
	List<Employee> selectEmployeeLikeName(Employee e);
}
