import java.io.*;
import java.util.*;

public class FileRead {
	private File file;
	FileInputStream fis;
	private LinkedList<String> content;
	private LinkedList<String> PalindromeText;
	
	public FileRead(String name)
	{
		this.fis = null;
		this.file = new File(name);
		this.content = new LinkedList<String>();
		this.PalindromeText = new LinkedList<String>();
	}
	
	public void openFile()
	{
		if(this.file.exists()) {
			System.out.println("\n File ' "+this.file+" ' exists ! \n");
		} else {
			System.out.println("File ' "+this.file+" 'not found");
		}	
	}	
	
	public LinkedList<String> getContent() {
		return content;
	}
	
	public void readFile()
	{
		try {			
			this.fis = new FileInputStream(this.file);
			InputStreamReader read = new InputStreamReader(this.fis);
			BufferedReader buff = new BufferedReader(read);
			String line;
			
			while((line = buff.readLine()) != null) {
				this.getContent().add(line);
			
			}
	
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void displayContent()
	{				
		int i=0;
		while (i < this.getContent().size()){
			System.out.println(this.getContent().get(i));
			i++;
		}
	}
	
	public LinkedList<String> getPalindromicText() {
		return PalindromeText;
	}
	
	public void displayPalindrom()
	{					
		int i=0;
		while (i< this.getPalindromicText().size()){
			System.out.print(this.getPalindromicText().get(i));
			i++;
			
		}
		
	}
	
	public void palindrome() {
		for(int i = 0; i < this.getContent().size(); i++) {
			for(int j = 0; j < this.getContent().get(i).length(); j++) {
				this.PalindromeText.add(Character.toString(this.getContent().get(i).charAt(j)));
			}
		}
		for(int i = this.getContent().size() - 1; i >= 0; i--) {
			for(int y = this.getContent().get(i).length() - 1; y >= 0 ;y--) {
				this.PalindromeText.add(Character.toString(this.getContent().get(i).charAt(y)));
			}
		}
	}
	
	
	
}