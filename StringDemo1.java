package week1;

public class StringDemo1 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1.concat(" " + str2 + "!");
		String str4 = str1.concat(" ").concat(str2).concat("!");
		String str5 = "hello world!";

		System.out.println("str3 = " + str3);
		System.out.println("str4 = " + str4);
		System.out.println("str5 = " + str5);

		if (str4.equals(str5)) {
			System.out.println("str4 and str5 are a perfect match.");
		} else if (str4.equalsIgnoreCase(str5)) {
			System.out.println("str4 and str5 match if you ignore case.");
		} else {
			System.out.println("str4 and str5 do not match.");
		}
		String name = "Jake Kander";
		System.out.println(name);
		System.out.println(name.toUpperCase());
		System.out.println("The letter \"K\" first appears in " + name + " at index " + name.toUpperCase().indexOf("K"));
		System.out.println(name);

		String date = "10/27/2016";
		System.out.println(date);
		System.out.print("split(String regex): ");
		String array1[] = date.split("/");
		for (String demo : array1) {
			System.out.print(demo);
		}
	}
}