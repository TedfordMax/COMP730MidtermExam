package ExamQ6;

import java.util.ArrayList;

public class ExamQ6Abstract {
	public static void main(String [] args) {
		ArrayList<SpaceShip> Hangar = new ArrayList <SpaceShip>();
		SpaceShip SW1 = new StarWarsSpaceShip (12, "Star Wars Ship 1", "Star Wars");
		SpaceShip SW2 = new StarWarsSpaceShip (20, "Star Wars Ship 2", "Star Wars");
		SpaceShip SW3 = new StarWarsSpaceShip (8, "Star Wars Ship 3", "Star Wars");
		SpaceShip ST1 = new StarTrekSpaceShip (5, "Star Trek Ship 1", "Star Trek");
		SpaceShip ST2 = new StarTrekSpaceShip (80, "Star Trek Ship 2", "Star Trek");
		SpaceShip ST3 = new StarTrekSpaceShip (30, "Star Trek Ship 3", "Star Trek");
		SpaceShip D1 = new OtherSciFiSpaceShip (150, "Dune Ship 1", "Dune");
		SpaceShip D2 = new OtherSciFiSpaceShip (10, "Dune Ship 2", "Dune");
		SpaceShip D3 = new OtherSciFiSpaceShip (55, "Dune Ship 3", "Dune");
		Hangar.add(SW1);
		Hangar.add(SW2);
		Hangar.add(SW3);
		Hangar.add(ST1);
		Hangar.add(ST2);
		Hangar.add(ST3);
		Hangar.add(D1);
		Hangar.add(D2);
		Hangar.add(D3);
		for (SpaceShip arrList : Hangar) {
			
		System.out.println(arrList.getName() + " weighs " + arrList.getTonnage() + " tons and is from " + arrList.getFranchise()); 
		}

	}
		
}

