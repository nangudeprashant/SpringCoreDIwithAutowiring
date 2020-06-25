package com.javaLive.constructorBased;

import org.springframework.beans.factory.annotation.Autowired;

public class Room {
	private String roomNumber;
	private Student allotedTo3;

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
//	@Autowired//Constructor based autowiring.
	public Room(Student allotedTo) {
		this.allotedTo3 = allotedTo;
	}

	@Override
	public String toString() {
		String name = "";
		if (allotedTo3 != null) {
			name = allotedTo3.getName();
		} else {
			name = "null";
		}
		return "Room [roomNumber=" + roomNumber + ", allotedTo=" + name + "]";
	}
}
