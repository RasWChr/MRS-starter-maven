package dk.easv.mrs.DAL;
import dk.easv.mrs.BE.Movie;
import java.util.List;

public interface IMovieDataAccess {
//needs to be able to do getAllMovies to be able to communicate with this interface
    List<Movie> getAllMovies() throws Exception;

    Movie createMovie(String title, int year) throws Exception;

    void updateMovie(Movie movie) throws Exception;

    void deleteMovie(Movie movie) throws Exception;

}
