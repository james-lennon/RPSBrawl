package com.csclub.rpsbattle;

import java.io.PrintWriter;
import java.util.Scanner;

public class User {
	private int id;
	private String name;
	private int state;
	private Game myGame;
	private Scanner input;
	private PrintWriter output;

	public User(int i, Scanner in, PrintWriter out) {
		id = i;
		state = 0;
		input = in;
		output = out;

	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getState() {
		return state;
	}

	public Scanner getInput() {
		return input;
	}

	public PrintWriter getOutput() {
		return output;
	}

	public void setName(String str) {
		name = str;
	}

	public void setState(int s) {
		state = s;
	}

	public String toString() {
		System.out.println("ID: " + getID() + " Name: " + getName() + " State "
				+ getState());
	}

}
