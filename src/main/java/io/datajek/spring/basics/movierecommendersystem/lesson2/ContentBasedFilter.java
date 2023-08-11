package io.datajek.spring.basics.movierecommendersystem.lesson2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ContentBasedFilter implements Filter{

    @Override
    public String[] getMovieRecommendation(String movieName) {
        return new String[]{"Kites","ZNMD","Iron Man"};
    }

}
