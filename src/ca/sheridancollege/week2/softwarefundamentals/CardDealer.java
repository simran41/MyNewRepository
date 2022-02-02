/*
 modifier name:simranjeet kaur
student number : 991634296
 */
package ca.sheridancollege.week2.softwarefundamentals;



public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        //changes made 
        Card c1 = new Card("hearts",2);
        c1.setSuit("spades");
        
        Card c2 = new Card("clubs",7);
        c2.setSuit("diamonds");
    }
    
}
