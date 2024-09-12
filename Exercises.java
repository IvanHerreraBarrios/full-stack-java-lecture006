package lecture006;

public class Exercises {

	public static void main(String[] args) {
		var f = "10"; //that is born as a float and dies as a float
		
		float flot = Float.parseFloat(f);
		
		int integer = Integer.parseInt(f);
		
		boolean equals = flot == integer;
		System.out.println(equals);
		
		// pre / post
		//integer = 10
		integer = integer + 1;
		integer++;
		
		integer = integer -1;
		integer--;
		
		boolean elderly = (integer > 10) ? true : false;
		System.out.println(elderly);
	}

}
