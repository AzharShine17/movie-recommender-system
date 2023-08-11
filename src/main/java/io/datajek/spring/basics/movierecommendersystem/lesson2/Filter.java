package io.datajek.spring.basics.movierecommendersystem.lesson2;

import org.springframework.stereotype.Component;

@Component
public interface Filter {
    public String[] getMovieRecommendation(String movieName);
}
