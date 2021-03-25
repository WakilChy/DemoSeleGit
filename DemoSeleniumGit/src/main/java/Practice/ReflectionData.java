package Practice;

public class ReflectionData {
	
	public String name="Wakil";

	private String email;
	
	public ReflectionData () {
		email="abc@gmail.com";
	}
	
	public void method1() {
		System.out.println("My email is "+email);
	}
	
	public void method2(int num) {
		System.out.println("My number is "+num);
	}
	
	private void method3() {
		System.out.println("private method no 3");
	}
	

}
