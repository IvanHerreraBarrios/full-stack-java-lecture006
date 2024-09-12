package lecture006;

import java.util.Scanner;


public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//let variable = prompt();
		
		char age;
		float height;
		short weight;
		String gender;
		
		//cntrl+ shift + r replace
		Scanner keyboard = new Scanner(System.in);
		
		age = (char)keyboard.nextInt();
		height = keyboard.nextFloat();
		weight = keyboard.nextShort();
		//char  keyboard.next().charAt(0);
		gender = keyboard.next();
		
		System.out.println((int)age+","+ height + "," + weight + "," + gender);
		//close keyboard
		keyboard.close();
		//f6 move
		//f8 excecute all
		
		
	}

}
