package ExamQ6;

import java.util.ArrayList;

public abstract class SpaceShip {
	int tonnage;
	String name;
	String Franchise;
	
	public Integer getTonnage() {
		return tonnage; 
	}

	public String getName() {
		return name;
	}
	
	public String getFranchise() {
		// Star Wars, Star Trek, or some other Sci-fi universe
		return Franchise;
	}
}


