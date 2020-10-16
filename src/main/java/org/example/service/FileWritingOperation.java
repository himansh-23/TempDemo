package org.example.service;

import java.nio.file.Path;

public interface FileWritingOperation {

    public void writeToFile(Path fileName, String content);
}
