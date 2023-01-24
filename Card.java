


public class Card
{
    private static final int ca = 52;
    String[] suit = {"Spade","Heart","Clup","Diamond"};
    String[] rank = {"A","2","3","4","5","6","7","8","9","10","J","K","Q"};
    String card;

    private String value;


    public Card(String[][] card ,String Ca)
    {
        for (int i = 0; i < suit.length; i++) 
        {
            for (int j = 0; j < rank.length; j++) 
            {
                String[] Card;
                this.card[i][j]= Card[ca];
            }
        }
        //this.suit = sui;
       // this.rank = rank
    }

    public String[] getRank()
    {
        return rank;
    }

    public int Value()
    {
        if(rank.equals("2"))
        {
            value=2;
        }
        else if(rank.equals("3"))
        {
            value=3;
        }
        else if(rank.equals("4"))
        {
            value=4;
        }
        else if(rank.equals("5"))
        {
            value=5;
        }
        else if(rank.equals("6"))
        {
            value=6;
        }
        else if(rank.equals("7"))
        {
            value=7;
        }
        else if(rank.equals("8"))
        {
            value=8;
        }
        else if(rank.equals("9"))
        {
            value=9;
        }
        else if(rank.equals("10"))
        {
            value=10;
        }
        else if(rank.equals("A"))
        {
            value=11;
        }
        else if(rank.equals("Q"))
        {
            value=10;
        }
        else if(rank.equals("J"))
        {
            value=10;
        }
        else if(rank.equals("K"))
        {
            value=10;
        }

        return value;
    }



    public String toString()
    {
        return(rank + " of " + suit);
    }

}