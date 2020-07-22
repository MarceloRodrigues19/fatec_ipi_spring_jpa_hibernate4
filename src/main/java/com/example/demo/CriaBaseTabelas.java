package com.example.demo;

import javax.persistence.Persistence;

public class CriaBaseTabelas {
	
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("marceloPU");
	}

}
