package io.datajek.spring.basics.movierecommendersystem.lesson2;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {



    @Override
    public String[] getMovieRecommendation(String movieName) {
        //filter logic should go here
        return new String[]{"AZHAR", "MS DHONI", "IRON MAN", "KITES", "RANJHANA"};
    }


}
