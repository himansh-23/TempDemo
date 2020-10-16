package org.example.service;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public interface FileOperation {

    public void createDirectory(Path path);

    public void createFilesInDirectory(Path path);

    public void deleteDirectoryAllFiles(Path p);
}
