package entities;

public class Employee {

	private String name;
	private double grossSalary;
	private double tax;
	
	public double netSalary() { 
		return this.grossSalary -= tax;
	}
	
	public void IncreaseSalary(double percentage) { 
		this.grossSalary *= 1+(percentage/100);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return this.getName() + ", $ " + String.format("%.2f", this.getGrossSalary());
	}
}
