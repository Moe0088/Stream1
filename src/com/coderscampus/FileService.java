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

			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				String name = parts[0];
				String country = parts[1];
				SuspectLocation suspectLocation = new SuspectLocation(name, country);
				suspectLocations.add(suspectLocation);
			}

		} finally {
			reader.close();
		}
		return suspectLocations;
	}
}
