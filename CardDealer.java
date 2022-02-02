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
        
        Card c1 = new Card("hearts",2);
        c1.setSuit("spades");
     
     System.out.println( nineClubs.setSuit("diamonds"));
     System.out.println(c1.setSuit("spades"));     
    }
    
}
