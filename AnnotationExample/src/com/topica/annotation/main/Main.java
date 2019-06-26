/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topica.annotation.main;

import com.topica.annotation.example1.PrintedImpl;
import com.topica.annotation.example1.Student;
import com.topica.annotation.example2.Reflection;

/**
 *
 * @author daohy
 */
public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("____________START EXAMPLE 1____________\n");
		PrintedImpl.printAnnotation(student);
		System.out.println("\n____________START EXAMPLE 2____________\n");
		Reflection.changeValueVariable(student, "SCHOOL_NAME");

	}
}
