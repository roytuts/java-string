package com.roytuts.java.stringjoiner.stringjoin;

import java.util.StringJoiner;
import java.util.UUID;

public class StringJoinerApp {

	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner("/");

		for (int i = 0; i < 5; i++) {
			String uuid = UUID.randomUUID().toString();
			stringJoiner.add(uuid);
		}

		System.out.println(stringJoiner);

		stringJoiner = new StringJoiner("/");
		stringJoiner.add("etc");
		stringJoiner.add("var");
		stringJoiner.add("cache");

		System.out.println(stringJoiner);

		stringJoiner = new StringJoiner("/", "/", "/");
		stringJoiner.add("etc");
		stringJoiner.add("var");
		stringJoiner.add("cache");

		System.out.println(stringJoiner);
	}

}
