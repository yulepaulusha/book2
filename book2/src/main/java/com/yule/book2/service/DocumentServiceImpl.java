package com.yule.book2.service;

import com.yule.book2.model.Document;
import com.yule.book2.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Yule.Paulusha on 4/14/2019.
 */
@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    DocumentRepository documentRepository;

    @Override
    public Document save(Document document) {
        return documentRepository.save(document);
    }

    @Override
    public List<Document> fetch() {
        return documentRepository.findAll();
    }
}
