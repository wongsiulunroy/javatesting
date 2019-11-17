package Student;

public class Student {
	String name;
	String age;
	String gender;
	int ID;
	
	public Student(String name, String age, String gender, int ID) {
		// TODO Auto-generated constructor stub
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.ID  = ID;
	
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 =  new Student("MAry","12","F",001);
		System.out.println(student1.name);
		System.out.println(student1.age);
		System.out.println(student1.gender);
		System.out.println(student1.ID);
		

	}

}
