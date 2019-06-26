/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topica.annotation.example1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daohy
 */
public class PrintedImpl {

    public static void printAnnotation(Object object) {
        Class<?> cls = object.getClass();
        Field fields[] = cls.getDeclaredFields();
        Method methods[] = cls.getDeclaredMethods();

        System.out.println("======= FIELD =======");
        for (Field field : fields) {
            int modifiers = field.getModifiers();
            if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
                try {
                    System.out.println(field.getName() + " = " + field.get(cls));
                } catch (IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(PrintedImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (field.getDeclaredAnnotation(Printed.class) != null) {
                System.out.println(field.getName());
            }
        }

        System.out.println("======= METHOD =======");
        for (Method method : methods) {
            if (method.getDeclaredAnnotation(Printed.class) != null) {
                System.out.println(method.getName());
            }
        }
    }
}
