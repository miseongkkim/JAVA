public class BuildingOwner extends GameCharacter {

	public BuildingOwner() {
		this.name = "BuildingOwner";
		money = 100000.0;
	}
	
	@Override
	public void printPrologue() {
		System.out.println("");
		System.out.println("I Have to ");
	}
}
