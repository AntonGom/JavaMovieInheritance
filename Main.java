public class Main
{
    public static void main(String[] args)
    {

        Movie movie = new Movie(5143, "Avatar", "PG-13");
        Action action = new Action(5843, "Spiderman 2", "G");
        Comedy comedy = new Comedy(7845, "Hangover", "R");
        Drama drama = new Drama(3962, "Titanic", "R");


        System.out.println("-------------------\nMovie Name: "+movie.getMovieTitle());
        System.out.println("Movie Rating: "+movie.getMovieRating());
        System.out.println("Movie ID Number: "+movie.getMovieID());
        System.out.println("Movie Late Fee: $" + movie.calcLateFees(1));


        System.out.println("-------------------\nAction Movie Name: "+action.getMovieTitle());
        System.out.println("Movie Rating: "+action.getMovieRating());
        System.out.println("Movie ID Number: "+action.getMovieID());
        System.out.println("Movie Late Fee: $" + action.calcLateFees(1));

        System.out.println("-------------------\nComedy Movie Name: "+comedy.getMovieTitle());
        System.out.println("Movie Rating: "+comedy.getMovieRating());
        System.out.println("Movie ID Number: "+comedy.getMovieID());
        System.out.println("Movie Late Fee: $" + comedy.calcLateFees(1));

        System.out.println("-------------------\nDrama Movie Name: "+drama.getMovieTitle());
        System.out.println("Movie Rating: "+drama.getMovieRating());
        System.out.println("Movie ID Number: "+drama.getMovieID());
        System.out.println("Movie Late Fee: $" + drama.calcLateFees(1));
        System.out.println("");

       //compares if the movie ID is the same
	System.out.println(action.equals(movie));





    }
}
