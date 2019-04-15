package com.yule.book2.controller;

import com.yule.book2.model.Card;
import com.yule.book2.model.Document;
import com.yule.book2.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yule.Paulusha on 4/14/2019.
 */
@RestController
@RequestMapping("bookapi")
public class DocumentController {
    @Autowired
    private DocumentService documentService;

    @RequestMapping(value = "/document", method = RequestMethod.POST)
    @ResponseBody
    public List<String> saveDocument(@RequestBody RequestWrapper requestWrapper){
        List<String> response = new ArrayList<>();

//        for(Card card: requestWrapper.getCards()){
//            card.setDocument((Document) requestWrapper.getDocuments());
//        }
//        Card card = new Card();
//        for(int i = 0; i<requestWrapper.getDocuments().size(); i++){
//            Card card = new Card();
//            requestWrapper.setCards(requestWrapper.getDocuments());
//        }

        System.out.println("reqst wrapper"+ requestWrapper);
        System.out.println("reqst wrapper get doc "+ requestWrapper.getDocuments());
        System.out.println("reqst wrapper get doc size  "+ requestWrapper.getDocuments().size());
        System.out.println("requst wrapper get cards"+ requestWrapper.getCards());

        for(Document document: requestWrapper.getDocuments()){
            documentService.save(document);
            response.add(document.toString());
        }


        System.out.println("reqst wrapper"+ requestWrapper);
        System.out.println("reqst wrapper get doc "+ requestWrapper.getDocuments());
        System.out.println("reqst wrapper get doc size  "+ requestWrapper.getDocuments().size());
        System.out.println("requst wrapper get cards"+ requestWrapper.getCards());

        return response;
    }

    @RequestMapping(value = "/document", method = RequestMethod.GET)
    public List<Document> fetch(){
        return documentService.fetch();
    }

}
