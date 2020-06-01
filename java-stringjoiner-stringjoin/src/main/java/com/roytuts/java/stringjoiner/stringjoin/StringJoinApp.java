package com.roytuts.java.stringjoiner.stringjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StringJoinApp {

	public static void main(String[] args) {
		String sep = "/";

		List<String> strings = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			String uuid = UUID.randomUUID().toString();
			strings.add(uuid);
		}

		String joinedString = String.join(sep, strings);

		System.out.println(joinedString);

		joinedString = String.join(sep, "etc", "var", "cache");

		System.out.println(joinedString);
	}

}
