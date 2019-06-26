/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topica.annotation.example1;

import com.topica.annotation.FinalField;

/**
 *
 * @author daohy
 */
public class Student {
	@FinalField
	public static final String SCHOOL_NAME = "Topica";
	public static final String SCHOOL_PHONE = "0352378680";
	@Printed
	private String name;
	private Integer age;
	@Printed
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	@Printed
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
