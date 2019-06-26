/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topica.annotation.example2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.java_cup.internal.runtime.Symbol;

/**
 *
 * @author daohy
 */
public class Reflection {
	public static final String FIELD_NAME = "modifiers";
	public static final String NEW_VALUE = "The value of the field has been changed.";

	public static void changeValueVariable(Object object, String variableName) {
		try {
			Class<?> cls = object.getClass();
			Field field = cls.getDeclaredField(variableName);
			field.setAccessible(true);
			Field modifiersField = Field.class.getDeclaredField(FIELD_NAME);
			try {
				modifiersField.setAccessible(true);
				modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
				field.set(null, NEW_VALUE);
				System.out.println(field.getName() + " = " + field.get(cls));
			} catch (IllegalArgumentException | IllegalAccessException ex) {
				Logger.getLogger(Reflection.class.getName()).log(Level.SEVERE, null, ex);
			}
		} catch (NoSuchFieldException | SecurityException ex) {
			Logger.getLogger(Reflection.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
