
public class Student extends Base{
	int studentNumber;
	double studentProgress;
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName,  String email, String courseName,
			int studentNumber, double studentProgress) {
		
		this.studentNumber = studentNumber;
		this.studentProgress = studentProgress;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public double getStudentProgress() {
		return studentProgress;
	}
	public void setStudentProgress(double studentProgress) {
		this.studentProgress = studentProgress;
	}

}
