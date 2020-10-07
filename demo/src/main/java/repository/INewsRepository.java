package repository;

import model.News;
import java.util.List;

public interface INewsRepository {
    List<News> addNewNews(News news);
    List<News> findAll();
}
