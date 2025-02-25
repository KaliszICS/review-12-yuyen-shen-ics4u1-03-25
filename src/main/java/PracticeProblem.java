public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(isPalindrome("RaceCar"));
		System.out.println(isPalindrome("he he"));
		System.out.println(isPalindrome("madam o madam"));
		System.out.println(isPalindrome("Mad am o  maDam"));
		System.out.println(getAge(new String[]{"Amy", "Cindy", "Bob", "Kevin"}, new int[]{25, 28, 44, 13}, "Cindy"));
		System.out.println(getAge(new String[]{"Amy", "Cindy", "Bob", "Kevin"}, new int[]{25, 28, 44, 13}, "Kevin"));
		System.out.println(countWords("Hello", 'l'));
		System.out.println(countWords("reference", 'e'));

	}

	//q1
	public static boolean isPalindrome(String word) {
		String word2 = word.toLowerCase();
		String word3 = word2.replaceAll(" ", "");
		String[] phraseArr = word3.split("");
		for (int a = 0; a < (phraseArr.length) / 2; a++) {
			if (!(phraseArr[a]).equals(phraseArr[phraseArr.length - 1 - a])) {
				return false;
			}
		} 
		return true;
	}
	
	//q2
	public static int getAge(String[] names, int[] ages, String name) {
		int age = 0;
		for (int b = 0; b < names.length; b++) {
			if (names[b].equals(name)) {
				age = ages[b];
			}
		}
		return age;
	}

	//q3
	public static int countWords(String word0, char character0) {
		int count = 0;
		String[] Warr = word0.split("");
		String character = String.valueOf(character0);
		for (int c = 0; c < Warr.length; c++) {
			if ((Warr[c]).equals(character)) {
				count++;
			} 
		}
		return count;
	}
}
