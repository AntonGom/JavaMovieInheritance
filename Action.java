public class Action extends Movie
{
    Action()
    {
        super();
    }

    Action(int id, String title, String rating)
    {
        super(id, title, rating);
    }

    public double calcLateFees(int day)
    {
        double totalFee= day*3.0;
        return totalFee;
    }

}