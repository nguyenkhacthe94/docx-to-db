package com.hanbi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextSaver {
	public TextSaver() {
	}

	public void save(String text) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("C:/Gradle/out.txt"));
			writer.write(text);

		} catch (IOException e) {
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
			}
		}
	}
}
