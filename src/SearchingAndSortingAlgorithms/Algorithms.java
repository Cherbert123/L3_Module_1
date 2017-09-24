package SearchingAndSortingAlgorithms;

import java.util.Arrays;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int broken = 0;
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i) == "cracked") {
				broken++;
			}
		}
		return broken * 2; //<- this needs changing
	}

	public static Object countPearls(List<Boolean> oysters) {
		int broken = 0;
		for(int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i) == true) {
				broken++;
			}
		}
		return broken;
	}

	public static double findTallest(List<Double> peeps) {
		Double tallest = 0.0;
		for(int i = 0; i < peeps.size(); i++) {
			if(tallest < peeps.get(i)) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = "";
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}

	public static Boolean containsSOS(List<String> message1) {
		boolean returner = false;
		for(int i = 0; i < message1.size(); i++) {
		if(message1.get(i).equals(" ... --- ... ")) {
			returner = true;
		}
		}
		return returner;
	}
	

	

	public static List<String> sortScores(List<Double> results) {
		List<String> returnable = Arrays.asList(new String[] {"60.3", "60.2", "80.4", "67.2", "95.0", "85.5", "40.7", "68.2", "38.4", "94.2", "85.0", "84.5", "50.1", "66.6" });
		
		for(int i = 0; i < results.size(); i++) {
			if(Integer.parseInt(returnable.get(i)) > Integer.parseInt(returnable.get(i + 1))) {
				String temp = returnable.get(i + 1);
				returnable.get(i + 1).equals(returnable.get(i));
				returnable.get(i).equals(temp);
			}
		}
		System.out.println(returnable);
		return returnable;
	}

	
	//Add other methods here
}