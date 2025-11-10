package dk.easv.mrs.DAL;
import dk.easv.mrs.BE.Movie;
import java.util.List;

public interface IMovieDataAccess {
//needs to be able to do getAllMovies to be able to communicate with this interface
    public List<Movie> getAllMovies() throws Exception;

    public Movie createMovie(String title, int year) throws Exception;

    public void updateMovie(Movie movie) throws Exception;

    public void deleteMovie(Movie movie) throws Exception;

}
