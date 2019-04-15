package com.yule.book2.repository;

import com.yule.book2.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Yule.Paulusha on 4/14/2019.
 */
public interface DocumentRepository extends JpaRepository<Document, Integer> {
}
