package com.yash.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;

import org.hibernate.annotations.Columns;

@Entity
public class User {

	 @Id
	    private String userName;
	    private String userFirstName;
	    private String userLastName;
	    private String userPassword;
	    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	    @JoinTable(name = "USER_ROLE",
	            joinColumns = {
	                    @JoinColumn(name = "USER_ID")
	            },
	            inverseJoinColumns = {
	                    @JoinColumn(name = "ROLE_ID")
	            }
	    )
	    private Set<Role> role;

	    public String getUserName() {
	        return userName;
	    }

	    public void setUserName(String userName) {
	        this.userName = userName;
	    }

	    public String getUserFirstName() {
	        return userFirstName;
	    }

	    public void setUserFirstName(String userFirstName) {
	        this.userFirstName = userFirstName;
	    }

	    public String getUserLastName() {
	        return userLastName;
	    }

	    public void setUserLastName(String userLastName) {
	        this.userLastName = userLastName;
	    }

	    public String getUserPassword() {
	        return userPassword;
	    }

	    public void setUserPassword(String userPassword) {
	        this.userPassword = userPassword;
	    }

	    public Set<Role> getRole() {
	        return role;
	    }

	    public void setRole(Set<Role> role) {
	        this.role = role;
	    }
	    
	/*
	 * @Id // @GeneratedValue(strategy = GenerationType.AUTO) // private int
	 * USER_ID;
	 * 
	 * @Column(name = "user_name") private String userName; private String
	 * userFirstName; private String userLastName; private String userPassword;
	 * 
	 * 
	 * @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 * // @MapsId("roleId")
	 * 
	 * @JoinTable(name = "USER_ROLE",
	 * 
	 * joinColumns = { @JoinColumn(name = "user_name") }, inverseJoinColumns =
	 * { @JoinColumn(name = "role_name") } ) private Set<Role> role=new HashSet<>();
	 * 
	 * 
	 * public User() {
	 * 
	 * }
	 * 
	 * 
	 * public int getUSER_ID() { return USER_ID; }
	 * 
	 * 
	 * 
	 * 
	 * public void setUSER_ID(int uSER_ID) { USER_ID = uSER_ID; }
	 * 
	 * 
	 * 
	 * public User(int uSER_ID, String userName, String userFirstName, String
	 * userLastName, String userPassword, Set<Role> role) { super(); // USER_ID =
	 * uSER_ID; this.userName = userName; this.userFirstName = userFirstName;
	 * this.userLastName = userLastName; this.userPassword = userPassword; this.role
	 * = role; }
	 * 
	 * public String getUserName() { return userName; }
	 * 
	 * public void setUserName(String userName) { this.userName = userName; }
	 * 
	 * public String getUserFirstName() { return userFirstName; }
	 * 
	 * public void setUserFirstName(String userFirstName) { this.userFirstName =
	 * userFirstName; }
	 * 
	 * public String getUserLastName() { return userLastName; }
	 * 
	 * public void setUserLastName(String userLastName) { this.userLastName =
	 * userLastName; }
	 * 
	 * public String getUserPassword() { return userPassword; }
	 * 
	 * public void setUserPassword(String userPassword) { this.userPassword =
	 * userPassword; }
	 * 
	 * public Set<Role> getRole() { return role; }
	 * 
	 * public void setRole(Set<Role> role) { this.role = role; }
	 * 
	 * @Override public String toString() { return "User [ userName=" + userName +
	 * ", userFirstName=" + userFirstName + ", userLastName=" + userLastName +
	 * ", userPassword=" + userPassword + ", role=" + role + "]"; }
	 */
}
