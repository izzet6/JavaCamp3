
public class InstructorManager {
	public void addCourse(Base base) {
		System.out.println("Kurs sisteme eklenmisdir:"+base.getCourseName());
	}
	public void getInfo (Student student) {
		System.out.println("Ogrenci:"+student.getFirstName()+" "+student.getLastName()+" "+student.getEmail());
		System.out.println("Ogrencinin faaliyeti:"+student.getCourseName()+" "+student.studentProgress);
	}

}
