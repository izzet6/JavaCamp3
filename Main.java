
public class Main {

	public static void main(String[] args) {
		User user =new User();
		user.setId(1);
		user.setFirstName("Izzet");
		user.setLastName("Ramazanli");
		user.setEmail("izzetrr@gmail.com");
		user.userNumber=1233;
		UserManager userManager=new UserManager();
		userManager.add(user);
		
		Student student =new Student();
		student.setCourseName("Java+React");
		student.studentProgress=45;
		StudentManager studentManager=new StudentManager();
		studentManager.getCourse(student);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.getInfo(student);
		

	}

}
