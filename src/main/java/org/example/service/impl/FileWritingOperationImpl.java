package org.example.service.impl;

import org.example.service.FileOperation;
import org.example.service.FileWritingOperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

public class FileWritingOperationImpl implements FileWritingOperation {

    @Override
    public void writeToFile(Path fileName, String content) {
        try {
//            new String
            Files.write(fileName, content.getBytes());
            for(Byte b:content.getBytes()){
                System.out.println(b);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
