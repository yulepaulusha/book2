package com.yule.book2.service;

import com.yule.book2.model.Document;

import java.util.List;

/**
 * Created by Yule.Paulusha on 4/14/2019.
 */
public interface DocumentService {
    Document save(Document document);
    List<Document> fetch();
}
