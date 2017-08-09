package com.zhy.model;

public class Employee {
	private Integer id;			 // 主键id
	private String loginname;	 // 登录名
	private String password;	 // 密码
	private String name;		 // 真实姓名
	private String sex;			 // 性别
	private Integer age;		 // 年龄
	private String phone;		 // 电话
	private Double salary;		     // 薪水
	private String state;	 	 // 状态
	public Employee() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", loginname=" + loginname
				+ ", password=" + password + ", name=" + name + ", sex=" + sex
				+ ", age=" + age + ", phone=" + phone + ", salary=" + salary
				+ ", state=" + state + "]";
	}
}
