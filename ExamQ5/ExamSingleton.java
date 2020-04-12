package ExamQ5;

public class ExamSingleton {
		private static ExamSingleton jokeInstance = null;
		public static String joke = "What do you call two Spanish people playing basketball? Juan en Juan.";	
	
	public static String tellJoke() {
		return joke;
	}
	
	public static ExamSingleton getInstance() {
		if (jokeInstance == null)
			jokeInstance = new ExamSingleton();
		
		return jokeInstance;
	}
}
	