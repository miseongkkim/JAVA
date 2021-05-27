public class Employee extends GameCharacter {

	public Employee() {
		this.name = "Employee";
		money = 50000.0;
	}
	
	@Override
	public void printPrologue() {
		System.out.println("");
		System.out.println("I Have to ");
	}
}
