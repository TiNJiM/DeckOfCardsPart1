import java.util.*;
public class DeckOfCards{
	Card deck[];
	public DeckOfCards(int num, boolean makeDeck){
		if(num == 52 && makeDeck){
			deck = Card.makeDeck();
		}
		else {
			deck = new Card[num];
			for(int j = 0; j<num; j++){
				Card newCard = new Card(0,0); //dummy card
				deck[j] = newCard;
			}
		}
	}
	public static DeckOfCards shuffle(DeckOfCards myDeck){
		DeckOfCards shuffled = new DeckOfCards(52, false);
		int random;
		for(int j = 0; j<52; j++){ //filling the shuffled array with dummy cards.
			Card dummyCard = new Card(0,0); //I can use the 0 rank to test for dummy cards in the next array.
			shuffled.deck[j] = dummyCard;
		}
		int x = 0;
		while(x<52){
			Random rndm = new Random();
			random = rndm.nextInt(52);
			int testRank = shuffled.deck[random].getRank();
			if(testRank == 0){
				shuffled.deck[random] = myDeck.deck[x];
			}
			else{
				continue;
			}
			x++;
		}
		//for(int o = 0; o<52; o++){
			//System.out.println(shuffled.deck[o].getSuit() + " " + shuffled.deck[o].getRank());
		//}
		return shuffled;
	}
	public static DeckOfCards deal1(DeckOfCards myDeck, int hand){ //to be used together with deal2
		DeckOfCards yourHand = new DeckOfCards(hand, false);
		for(int x = 0; x<hand;x++){
			yourHand.deck[x] = myDeck.deck[x];
		}
		return yourHand;
	}
	public static DeckOfCards deal2(DeckOfCards myDeck, int hand){ //to be used together with deal1
		DeckOfCards newDeck = new DeckOfCards(myDeck.deck.length - hand, false);
		int j = 0;
		for(int x = hand; x<myDeck.deck.length; x++){
			newDeck.deck[j] = myDeck.deck[x];
			j++;
		}
		return newDeck;
	}
}
