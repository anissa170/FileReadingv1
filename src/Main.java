public class Main {

	public static void main(String[] args) {
	
		FileRead pal = new FileRead("C://file.txt");
		Palindrome original = new Palindrome("C://file.txt");

		
		original.openFile();
		
		
		System.out.println(" ***************** ORIGINAL CONTENT ***************** \n ");
		pal.readFile();
		pal.displayContent();
		System.out.println(" ***************** CONTENT REVERSED ***************** \n");
		pal.palindrome();
		pal.displayPalindrom();
	}

}