package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.lesson1.RecommenderImplementation;
import io.datajek.spring.basics.movierecommendersystem.lesson2.ContentBasedFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
//        RecommenderImplementation recommenderImplementation = new RecommenderImplementation(new ContentBasedFilter());
//        String[] movies = recommenderImplementation.recommendedMovies("Love");
//        System.out.println(Arrays.toString(movies));

        ApplicationContext context = SpringApplication.run(MovieRecommenderSystemApplication.class);
        RecommenderImplementation bean = context.getBean(RecommenderImplementation.class);
        RecommenderImplementation bean1 = context.getBean(RecommenderImplementation.class);
        System.out.println(bean1);
        System.out.println(bean);

    }

}
