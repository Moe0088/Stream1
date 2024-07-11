package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {

	public List<SuspectLocation> readFile(String filename) throws IOException {
		List<SuspectLocation> suspectLocations = new ArrayList<>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filename));
			String line;

			reader.readLine();
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				String country = parts[0];
				String name = parts[1];
				SuspectLocation suspectLocation = new SuspectLocation(name, country);
				suspectLocations.add(suspectLocation);
			}

		} finally {
			reader.close();
		}
		return suspectLocations;
	}
}
