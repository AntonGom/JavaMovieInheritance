public class Movie
{
    private int idNumber;
    private String movieTitle;
    private String rating;

    public Movie() {

    }

    public Movie(int id, String title, String rate)
    {
        this.idNumber = id;
        this.movieTitle = title;
        this.rating = rate;
    }

    public double calcLateFees(int day)
    {
        double totalFee = day * 2.0;
        return totalFee;
    }

    public void setMovieTitle(String mtitle)
    {

        movieTitle = mtitle;

    }

    public String getMovieTitle()
    {
        return movieTitle;
    }


    public void setMovieRating(String mrating)
    {

        movieTitle = mrating;

    }

    public String getMovieRating()
    {
        return rating;
    }

    public void setMovieID(String mID)
    {

        movieTitle = mID;

    }

    public int getMovieID()
    {
        return idNumber;
    }


    public boolean equals(Object obj)
    {
        Movie m = (Movie) obj;

        if(idNumber == m.idNumber)
        {
            return true;
        }
        else
        {
            return false;
        }



    }
}