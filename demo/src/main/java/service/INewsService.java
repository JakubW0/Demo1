package service;

import model.News;

import java.util.List;

public interface INewsService {
    List<News> findAll();
}
