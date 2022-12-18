package org.example.decorator;

import lombok.Getter;

import java.util.concurrent.TimeUnit;

public class TimedDocument{
    private final Document document;
    @Getter
    private final double time;
    TimedDocument(Document document){
        this.document = document;
        long start = System.nanoTime();
        this.document.parse();
        long elapsedTime = System.nanoTime() - start;
        time = (double)elapsedTime / 1_000_000_000.0;
    }
}
