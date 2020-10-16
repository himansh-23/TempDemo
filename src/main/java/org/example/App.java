package org.example;

import org.example.enums.SimpleEnum;
import org.example.service.FileOperation;
import org.example.service.FileWritingOperation;
import org.example.service.impl.FileOperationImpl;
import org.example.service.impl.FileWritingOperationImpl;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{

    public static  final String HOME= "user.home";


    public static void main( String[] args ) {
//        String dir =System.getProperty(HOME) +"/Desktop/Testing";
//        Path p =Paths.get(dir);
        FileOperation fileOperation = new FileOperationImpl();
//        fileOperation.createDirectory(p);
//        fileOperation.createFilesInDirectory(p);
//        fileOperation.deleteDirectoryAllFiles(p);
//        System.out.println(dir);
        FileWritingOperation fileWritingOperation = new FileWritingOperationImpl();
        fileWritingOperation.writeToFile(Paths.get("myfile.txt"),"Hello Himanshu");
    }
}




















//        Method[] z=  new  FileWritingOperationImpl().getClass().getMethods();
//        for(Method x:z){
//            System.out.println(x.toString());
//        }