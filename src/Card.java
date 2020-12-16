public class Card {
    private final String rank;
    private final String suit;
    public Card (String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }
    public String getRank(){
        return rank;
    }

    public static int[] getOrderedRank(String rank){
        int [] a = new int[2];
        try {
            a[0] = Integer.parseInt(rank);
        } catch (NumberFormatException e){
            if(rank.equals("A")){
                a[0] = 1;
                a[0] = 11;
            }else {
                a[0] = 10;
            }
        }
        return a;
    }

    public String toString() {
        String result;
        if (rank == null || suit == null) {
            result = "Face Down Card";
        } else {
            result = rank + suit;

        }
        return result;
    }

}