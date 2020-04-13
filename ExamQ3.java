import java.util.Random;

public class ExamQ3 {
		public static void main(String[] args) {
			int finalNum = 0;
			
			for (int i=0; i<10;i++) {
				Random rand = new Random();
				int nextNumber = rand.nextInt();
				finalNum += nextNumber;
				System.out.println("Random number: " + (i+1) + " = " + nextNumber); 
			}
					System.out.println("The total is: " + finalNum);
		}
	}