/**
 * 
 */
package com.example.entity;

/**
 * @author monika.kolhe
 *
 */
public class User {

	private int Id;
	private String name;
	
	
	
	public User(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
