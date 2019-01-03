package edu.aa.fly.lab4clientsentence.controller;

import edu.aa.fly.lab4clientsentence.connector.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class SentenceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SentenceController.class);

    private ISubjectConnector subjectConnector;
    private IVerbConnector verbConnector;
    private IArticleConnector articleConnector;
    private IAdjectiveConnector adjectiveConnector;
    private INounConnector nounConnector;

    public SentenceController(ISubjectConnector subjectConnector, IVerbConnector verbConnector, IArticleConnector articleConnector, IAdjectiveConnector adjectiveConnector, INounConnector nounConnector) {
        this.subjectConnector = subjectConnector;
        this.verbConnector = verbConnector;
        this.articleConnector = articleConnector;
        this.adjectiveConnector = adjectiveConnector;
        this.nounConnector = nounConnector;
    }


    @GetMapping("/sentence")
    public String getSentence() {
        String sentence = subjectConnector.getSuject() + " "
                + verbConnector.getVerb() + " "
                + articleConnector.getArticle() + " "
                + adjectiveConnector.getAdjective() + " "
                + nounConnector.getNoun() + ".";
        LOGGER.info("Sentence Controller; sentence -> {}", sentence);
        return sentence;
    }

}
