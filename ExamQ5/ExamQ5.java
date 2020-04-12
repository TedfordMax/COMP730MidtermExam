package ExamQ5;

public class ExamQ5 {
	public static void main(String [] args) {
		ExamSingleton jokeSingleton = ExamSingleton.getInstance();
		System.out.println(jokeSingleton.tellJoke());
	}
}
