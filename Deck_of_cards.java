import java.util.Random;

public class Deck_of_cards{
	public card[] Deck = new card[52] ;
	private String[] suits = {"clubs","diamonds","hearts","spades"};
	private String[] numbers = {"Ace", "Two", "Three", "Four", "Five", "Six",
						"Seven","Eight", "Nine", "Ten", "King", "Queen",
						"Jack"};
	public Deck_of_cards(){
		int i = 0;
		for(String suit: suits){
			for(String number: numbers){
				Deck[i] = new card(suit, number);
				i++;
			}
		}
	}
	
	public void show_Deck(){
		int count = 0;
		for(card c: Deck){
			System.out.printf("%20s", c.get_name());
			count++;
			if(count%4 == 0)System.out.println();
		}
	}
	
	public void shuffle(){
		Random rand = new Random();
		int pos=0;
		for(int i=0;i<52;i++){
			pos = rand.nextInt(52);
			card temp = Deck[i];
			Deck[i] = Deck[pos];
			Deck[pos] = temp;
		}
	}
	
}