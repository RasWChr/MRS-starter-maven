package dk.easv.mrs.BLL.util;
import dk.easv.mrs.BE.Movie;
import java.util.ArrayList;
import java.util.List;

public class MovieSearcher {

    /*searches the movie list
    uses a for loop to look through the list
    and compares the movie title and year to any movie in the array
    then adds the movie to the search result if it is there
    * */
    public List<Movie> search(List<Movie> searchBase, String query) {
        List<Movie> searchResult = new ArrayList<>();

        for (Movie movie : searchBase) {
            if(compareToMovieTitle(query, movie) || compareToMovieYear(query, movie))
            {
                searchResult.add(movie);
            }
        }

        return searchResult;
    }

    private boolean compareToMovieYear(String query, Movie movie) {
        return Integer.toString(movie.getYear()).contains(query);
    }

    private boolean compareToMovieTitle(String query, Movie movie) {
        return movie.getTitle().toLowerCase().contains(query.toLowerCase());
    }

}
