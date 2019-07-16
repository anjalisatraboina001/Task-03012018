package com.anjali.dao;

import java.util.List;

import com.anjali.model.Person;

public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}
