package org.example.service.impl;

import org.example.service.FileOperation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.UUID;
import java.util.stream.IntStream;

public class FileOperationImpl implements FileOperation {


    @Override
    public void createDirectory(Path path) {
        try {
            if (Files.notExists(path)) {
                Files.createDirectory(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteDirectoryAllFiles(Path p) {
        if (Files.exists(p)) {
            File f = p.toFile();
            File[] f2 = f.listFiles();
            if (f2 != null) {
                for (File f3 : f2) {
                    System.out.println("Deleting ->" + f3.getName());
                    f3.delete();
                }
            }
        }
    }

    @Override
    public void createFilesInDirectory(Path path)  {
            if (Files.exists(path)) {
                try {
                    for (int i = 0; i < 10; i++) {
                        Path tempdir = Paths.get(String.valueOf(path) + "/" + UUID.randomUUID().toString());
                        Files.createDirectory(tempdir);
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

}
