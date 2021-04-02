package corejava.equalsandhashcode;

public class EqualsSample {
	public static void main(String[] args) {
		String str1 = new String("Test");
		String str2 = new String("Test");
		Object obj;
		boolean referenceEquality = str1==str2;
		boolean logicalEquality = str1.equals(str2);
		System.out.println("Reeference equality i.e. str1==str2 :"+referenceEquality);
		System.out.println("Logical equality i.e. str1.equals(str2):"+logicalEquality);
	}

}
