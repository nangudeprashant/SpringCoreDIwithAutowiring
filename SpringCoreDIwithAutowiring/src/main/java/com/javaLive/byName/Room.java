package com.javaLive.byName;

public class Room {
	private String roomNumber;
	private Student allotedTo1;

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Student getAllotedTo1() {
		return allotedTo1;
	}

	public void setAllotedTo1(Student allotedTo1) {
		this.allotedTo1 = allotedTo1;
	}

	@Override
	public String toString() {
		String name = "";
		if (this.allotedTo1 != null) {
			name = allotedTo1.getName();
		}
		else{
			name="null";
		}
		return "Room [roomNumber=" + roomNumber + ", allotedTo=" + name + "]";
	}
}
