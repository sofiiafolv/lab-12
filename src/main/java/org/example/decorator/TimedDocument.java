package org.example.decorator;

import lombok.Getter;

import java.util.concurrent.TimeUnit;

public class TimedDocument implements Document{
    private final Document document;
    TimedDocument(Document document){
        this.document = document;

    }

    @Override
    public String parse() {
        long start = System.nanoTime();
        this.document.parse();
        long elapsedTime = System.nanoTime() - start;
        System.out.println((double)elapsedTime / 1_000_000_000.0);
        return document.parse();
    }
}
