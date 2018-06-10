package com.nt.wish;

public class Wish {
	public String getWishMsg(String name) {
		return "Good Mrng  " +name;
	}
	public static void main(String[] args) {
		System.out.println(new Wish().getWishMsg("siku"));
	}

}
