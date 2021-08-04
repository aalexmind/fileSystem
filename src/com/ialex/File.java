package com.ialex;

import java.util.concurrent.atomic.AtomicInteger;

public class File {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private String name;
    private String content;

    public File(String name) {
        this.id = count.incrementAndGet();
    }

    public final boolean isDirectory() {
        return this instanceof Directory;
    }

    public void rename(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
