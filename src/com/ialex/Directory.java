package com.ialex;

import java.util.List;

public class Directory extends File{
    private List<File> files;

    public Directory(String name) {
        super(name);
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void removeFile(File file) {
        this.files.remove(file);
    }
}
