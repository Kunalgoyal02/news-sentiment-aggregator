package com.newsapp;

public class SentimentService {

    public String analyze(String text) {
        if (text.contains("amazing") || text.contains("soaring")) {
            return "positive";
        } else if (text.contains("tensions") || text.contains("crash")) {
            return "negative";
        } else {
            return "neutral";
        }
    }
}
