package com.ialex;

public class FileSystem {
    Directory rootDir;
    public FileSystem() {
        rootDir = new Directory("/");
    }

    public void addFile(String filePath) {
        String[] split = filePath.split("/");
        Directory currentDir = rootDir;
        for (int i = 0; i < split.length; i++) {
            if (i == split.length - 1) {
                File file = new File(split[i]);
                currentDir.addFile(file);
            }
            Directory dir = new Directory(split[i]);
            currentDir.addFile(dir);
            currentDir = dir;
        }
    }

    public void removeFile(String filePath) {
        String[] split = filePath.split("/");
        Directory currentDir = rootDir;
        for (int i = 0; i < split.length; i++) {
            if (i == split.length - 1) {
                File file = new File(split[i]);
                currentDir.addFile(file);
            } else {
                Directory dir = new Directory(split[i]);
                currentDir.addFile(dir);
                currentDir = dir;
            }
        }
    }

    public String listFiles(String filePath) {
        String[] split = filePath.split("/");
        Directory currentDir = rootDir;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (i == split.length - 1) {
                for (File file : currentDir.getFiles()) {
                    sb.append(file.getName()).append("\n");
                }
            } else {
                String s = split[i];
                File file = currentDir.getFiles().stream().filter(f -> s.equals(f.getName())).findAny().orElse(null);
                if (file.isDirectory()) {
                    currentDir = (Directory) file;
                }
            }
        }
        return sb.toString();
    }
}
