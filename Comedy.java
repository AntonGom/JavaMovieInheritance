public class Comedy extends Movie
{
    public Comedy()
    {
        super();
    }

    Comedy(int id, String title, String rating)
    {
        super(id, title, rating);
    }

    public double calcLateFees(int day)
    {
        double totalFee= day*2.50;
        return totalFee;
    }


}
