package week1;

public class StringDemo2 {

	public static void main(String[] args) {
		String wall = "green wall";
		System.out.println(wall);
//		boolean isGreen;
		if (wall.toUpperCase().startsWith("G")) {
			System.out.println("The wall is green.");
		} else {
			System.out.println("The wall is NOT green.");
		}
		StringBuffer strBuff = new StringBuffer("String Buffer test!");
		System.out.println(strBuff);	
		strBuff.append("\t Super!");
		System.out.println(strBuff);		
	}
}
