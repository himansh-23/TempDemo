package org.example.annotations;

import java.lang.annotation.*;

/**
 *Annotation Demo This is Documented Here
 *For Learning Purpose
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CustomAnno {
}
