package com.newsapp;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    private final SentimentService sentimentService = new SentimentService();

    @GetMapping
    public List<Map<String, String>> getNews() {
        List<String> articles = List.of(
            "Stocks are soaring in the tech industry!",
            "Political tensions are rising again.",
            "New smartphone released with amazing features!"
        );

        List<Map<String, String>> analyzed = new ArrayList<>();
        for (String article : articles) {
            Map<String, String> item = new HashMap<>();
            item.put("title", article);
            item.put("sentiment", sentimentService.analyze(article));
            analyzed.add(item);
        }

        return analyzed;
    }
}
