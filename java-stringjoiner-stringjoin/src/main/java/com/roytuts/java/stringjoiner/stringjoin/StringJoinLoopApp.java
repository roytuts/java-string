package com.roytuts.java.stringjoiner.stringjoin;

import java.util.UUID;

public class StringJoinLoopApp {

	public static void main(String[] args) {
		String sep = "";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 5; i++) {
			String uuid = UUID.randomUUID().toString();
			sb.append(sep);
			sb.append(uuid);
			sep = "/";
		}

		System.out.println(sb.toString());

		sep = "/";

		sb = new StringBuilder();

		for (int i = 0; i < 5; i++) {
			String uuid = UUID.randomUUID().toString();
			sb.append(sep);
			sb.append(uuid);
			sep = "/";
		}

		System.out.println(sb.toString());
		
		sep = "/";

		sb = new StringBuilder();

		for (int i = 0; i < 5; i++) {
			String uuid = UUID.randomUUID().toString();
			sb.append(sep);
			sb.append(uuid);
			sep = "/";
		}
		
		sb.append(sep);

		System.out.println(sb.toString());
	}

}
