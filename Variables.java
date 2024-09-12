package lecture006;

public class Variables {
	
	//main cntl + scpace
	public static void main(String[] args) {
		//primitives, integers
		byte b = -127; //-128 to 127
		short s = 128; //-32768 to 32767
		int i = -2147483648; // -2147483648 to -2147483647
		long l = -100000000; //-9223372036854775808
		
		//bye < short < int < long < float < double
		s = b;
		//float
		float f = 0.0f; //exp + mantiza 1.4 e 038
		double d = 0.0;
		
		//float < double
		d = f;
		d = l;
		d = b;
		//string
		char c = 'e';
		char[] cn = new char[] {'c', 'a', 'r', 'l', 'o', 's'};
		String name = "carlos";
		
		//boolean
		boolean flag = true;
		
	}

}
