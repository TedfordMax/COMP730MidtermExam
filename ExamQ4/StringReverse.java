
public class StringReverse {
	
	public String reverseString(String str) {
		while (str.isEmpty()) {
			return "null";
		}
		{StringBuilder call = new StringBuilder();
		call.append(str);
		call = call.reverse();
		return call.toString();
		}	 
	}
}