package org.example.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Executor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
       Class x =  Class.forName("org.example.annotations.TestClass");
       Method[] x2 =x.getMethods();
       for(Method x3:x2){
           System.out.println(x3.getName());
       }
       Field f =x.getDeclaredField("value");
      if(x.isAnnotationPresent(CustomAnno.class)){
          Constructor c =x.getConstructor();
          TestClass xe =(TestClass) c.newInstance();
          System.out.println(f.get(xe));
          xe.addTwo(1,7);
      }

    }
}
