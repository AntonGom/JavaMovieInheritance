public class Drama extends Movie
{

    Drama()
    {
        super();
    }

    Drama(int id, String title, String rating)
    {
        super(id, title, rating);
    }

    public double calcLateFees(int day)
    {
        double totalFee= day*2.0;
        return totalFee;
    }
}