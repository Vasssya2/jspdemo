package jspdemo;

public class StudentsList {
	
	public static Student[] getStudentsList () {
		
		Student[] arr = new Student [3];
		arr[0] = new Student("asd@gmail.com", "Vasili", "Chernobai");
		arr[1] = new Student("asd2@gmail.com", "Valeri", "Maiboroda");
		arr[2] = new Student("asd3@gmail.com", "Alejandro", "Sisuev");
		
		return arr;
		
	}

}
