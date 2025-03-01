
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Hand implements Comparable <Hand>{
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add (Card card){
        this.hand.add(card);
    }
    public void sort (){
        hand.stream()
                .sorted()
                .forEach(x->System.out.println(x.toString()));
                } 
    
    
    public void print(){
        hand.stream().forEach(x->System.out.println(x.toString()));
    }

    @Override
    public int compareTo(Hand o) {
        int currentHand=this.hand
                .stream()
                .map(x->x.getValue())
                .reduce(0,(prevNum,thisNum) -> prevNum+thisNum);
        
        int comparedHand=o.hand
                .stream()
                .map(x->x.getValue())
                .reduce(0,(prevNum,thisNum) -> prevNum+thisNum);
        
return currentHand-comparedHand;
}
    public void sortBySuit(){
        Collections.sort(hand, new BySuitInValueOrder());

    }
}