package com.yule.book2.controller;

import com.yule.book2.model.Card;
import com.yule.book2.model.Document;

import java.util.List;

/**
 * Created by Yule.Paulusha on 4/14/2019.
 */
public class RequestWrapper {
    private List<Document> documents;
    private List<Card> cards;

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
