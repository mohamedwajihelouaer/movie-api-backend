package com.jyx.movies;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Path("/api/movie")
@ApplicationScoped
public class MovieResource {

    List<Movie> movies = Arrays.asList(
            new Movie(1L, "Matrix", LocalDate.of(1999, 11, 10)),
            new Movie(2L, "Matrix 2", LocalDate.of(2001, 3, 5)),
            new Movie(3L, "Matrix 3", LocalDate.of(2003, 6, 5)),
            new Movie(4L, "Matrix 4", LocalDate.of(2020, 10, 15))
    );

    @GET
    public Response getMovies() {
        return  Response.ok().entity(movies).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response addMovie(Movie movie) {
        movies.add(movie);
        return Response.status(Response.Status.CREATED).entity(movie).build();
    }

    @DELETE
    @Path("/movies/{id}")
    public Response deleteMovie(@PathParam("id") Long id) {
        movies.stream()
                .filter(movie -> movie.getId().equals(id))
                    .findFirst().ifPresent(movie -> movies.remove(movie));

        return Response.noContent().build();
    }
}
