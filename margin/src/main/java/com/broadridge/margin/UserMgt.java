package com.broadridge.margin;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class UserMgt implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public UserMgt() {
		super();
		
		String User1 = "User5";
		String User5 = "User6";
		users = new HashMap<String, String>();
		users.put("User1", User1);
		users.put("User5", User5);
				
		// TODO Auto-generated constructor stub
	}

	public UserMgt(Map<String, String> users) {
		super();
		this.users = users;
	}

	public Map<String, String> getUsers() {
		return users;
	}

	public void setUsers(Map<String, String> users) {
		this.users = users;
	}

	private Map<String, String> users;
	
	public String getUser(String userid){
		
		return users.get(userid);
	}
}
