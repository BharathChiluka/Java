package Oyoprod.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.data.mongodb.core.mapping.Field;


@Entity
@Table(name = "Users")
public class Users {
	@Id
	@Field("id")
	private int id;
	private int  status;
	private int device_role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getDevice_role() {
		return device_role;
	}
	public void setDevice_role(int device_role) {
		this.device_role = device_role;
	}

}
