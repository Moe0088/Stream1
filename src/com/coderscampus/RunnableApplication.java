package com.coderscampus;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RunnableApplication {

	public static void main(String[] args) throws IOException {
		List<String> filenames = Arrays.asList("InterpolWatchReport-Week1.csv", "InterpolWatchReport-Week2.csv",
				"InterpolWatchReport-Week3.csv");
		FileService fileService = new FileService();

		for (String filename : filenames) {
			List<SuspectLocation> suspectLocations = fileService.readFile(filename);
			Optional<SuspectLocation> optionalSuspect = suspectLocations.stream()
					.filter(suspectLocation -> "CARMEN SANDIEGO".equalsIgnoreCase(suspectLocation.getName()))
					.findAny();
					

			optionalSuspect.ifPresent(
					suspectLocation -> System.out.println("Carmen Sandiego is in " 
			+ suspectLocation.getCountry()));
					
		}
	}
}