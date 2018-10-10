package com.structural.proxy;

import java.io.IOException;
import java.io.InputStream;

public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws IOException {
		Process process = Runtime.getRuntime().exec(cmd);
		InputStream is = process.getInputStream();
		int i = 0;
		while ((i = is.read()) != -1) {
			System.out.print((char) i);
		}
		System.out.println(cmd + " command executed.");
	}
}
