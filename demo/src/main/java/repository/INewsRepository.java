package repository;

import model.News;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface INewsRepository {
    List<News> addNewNews(News news);
}
