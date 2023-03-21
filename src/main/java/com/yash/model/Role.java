package com.yash.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

	
	@Id
    private String roleName;
    private String roleDescription;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }
	/*
	 * @Id // @GeneratedValue(strategy = GenerationType.AUTO)
	 * 
	 * // private int ROLE_ID;
	 * 
	 * @Column(name = "role_name") private String roleName; private String roleDesc;
	 * 
	 * public Role() {
	 * 
	 * }
	 * 
	 * public Role(int rOLE_ID, String roleName, String roleDesc) { super(); //
	 * ROLE_ID = rOLE_ID; this.roleName = roleName; this.roleDesc = roleDesc; }
	 * 
	 * public String getRoleName() { return roleName; }
	 * 
	 * 
	 * public int getROLE_ID() { return ROLE_ID; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public void setROLE_ID(int rOLE_ID) { ROLE_ID = rOLE_ID; }
	 * 
	 * 
	 * public void setRoleName(String roleName) { this.roleName = roleName; }
	 * 
	 * public String getRoleDesc() { return roleDesc; }
	 * 
	 * public void setRoleDesc(String roleDesc) { this.roleDesc = roleDesc; }
	 * 
	 * @Override public String toString() { return "Role [ roleName=" + roleName +
	 * ", roleDesc=" + roleDesc + "]"; }
	 */

}
