package entities;

public class Company extends Tax {
	public Integer employee;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer employee) {
		super(name, anualIncome);
		this.employee = employee;
	}
	
	

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}

	@Override
	public double imposto() {
		double tax = 0.0;
		if(employee > 10) {
			tax = getAnualIncome() * 0.14;
		}else {
			tax = getAnualIncome() * 0.16;
		}
		return tax;
	}
	
}
