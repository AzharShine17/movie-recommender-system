package io.datajek.spring.basics.movierecommendersystem.lesson1;
import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class RecommenderImplementation {
    @Autowired
    private final Filter filter;

    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;

    }

    public String[] recommendedMovies(String movieName) {
        String[] movies = filter.getMovieRecommendation(movieName);
        return movies;
    }
}
