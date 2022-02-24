package entities;

public class Student {
	private String name;
	private double grade1;
	private double grade2;
	private double grade3;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}
	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}
	public void setGrade3(double grade3) {
		this.grade3 = grade3;
	}
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	public boolean result() {
		if (this.finalGrade() >= 60.0) {
			return true;
		}

		return false;
	}

	public double missingpoints() {
		if (this.finalGrade() < 60) {
			return 60 - this.finalGrade();
		}
		return 0;
	}
	@Override
	public String toString(){
		if (this.result() == true){
			return "FINAL GRADE: " + String.format("%.2f", this.finalGrade())+" \n  PASS";
		}
		return "FINAL GRADE: "+ String.format("%.2f", this.finalGrade()) + "\n FAILED \nMISSING , " +  String.format("%.2f", this.missingpoints()) + " POINTS";
	}
}