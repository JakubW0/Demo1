package repository;

import lombok.*;
import model.News;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import service.INewsService;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class NewsRepository implements INewsRepository {

    private List<News> newsList = new ArrayList<>();

    @Override
    public List<News> addNewNews(News news) {
        newsList.add(news);
        return newsList;
    }

}
