

class Tran {
	private String englishWord;
	private String finnishWord;
	private int year;
	
	public Tran(String englishWord, String finnishWord, int year) {
		this.englishWord = englishWord;
		this.finnishWord = finnishWord;
		this.year = year;
	}
	
	public String getEnglishWord() {
	return englishWord;
	
	}
	public int getYear() {
		return year;
		
		}
	public String getFinnishWord() {
	return finnishWord;
	}
	public String toString() {
		return englishWord+ " " + finnishWord +" " + year ;
	}
public class fusk{
	public static void main(String[] args) {
		Tran pair1 = new Tran ("hello", "Hi" ,2024);
		Tran pair2 = new Tran ("hello","Hi", 2023);
		System.out.println("==== demo =====");
		System.out.println(pair1.toString());
		System.out.println(pair2.toString());
		
		
	}
	
}
	
	
}
