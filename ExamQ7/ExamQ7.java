package ExamQ7;

import java.util.ArrayList;

public abstract class ExamQ7 {
	public static void main(String [] args) {
		  ArrayList<BakedGoods> noms = new ArrayList<BakedGoods>();
		  Cookie C1 = new Cookie(1, "Chocolate", "4/12/2020");
		  Cookie C2 = new Cookie(2, "Macadamian Nut", "4/13/2020");
		  Cookie C3 = new Cookie(3, "Double Chocolate Chunk", "4/12/2020");
		  CinnamonRoll CR1 = new CinnamonRoll(1, "Old", "4/10/2020");
		  CinnamonRoll CR2 = new CinnamonRoll(2, "Moist", "4/13/2020");
		  CinnamonRoll CR3 = new CinnamonRoll(3, "Fresh", "4/14/2020");
		  Brownie B1 = new Brownie(1, "Crusty", "4/11/2020");
		  Brownie B2 = new Brownie(2, "Decadent", "4/13/2020");
		  Brownie B3 = new Brownie(5, "Fudgetastic", "4/12/2020");
		  noms.add(C1);
		  noms.add(C2);
		  noms.add(C3);
		  noms.add(CR1);
		  noms.add(CR2);
		  noms.add(CR3);
		  noms.add(B1);
		  noms.add(B2);
		  noms.add(B3);
		  for (BakedGoods arrList : noms) {
				
				System.out.println("Baked Goods cost $" + arrList.getPrice() + " if they are " + arrList.getDescription() + " and the sell by date is " + arrList.getSellByDate()); 
				}

	}
}
