package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
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
	

	

	public static List<Double> sortScores(List<Double> results) {
		List<Double> returnable = new ArrayList<Double>();
		double previousSmallest = 0; 
		double smallest = 10000.0;
		for(int x = 0; x < results.size();x++) {
		for(int i = 0; i < results.size();i++) {
			if(results.get(i)< smallest && results.get(i) > previousSmallest) {
				smallest = results.get(i);
			}
		}
		returnable.add(smallest);
		previousSmallest = smallest;
		smallest = 10000.0;
		}
		return returnable;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		List<String> returnable = new ArrayList<String>();
		int previousSmallest = 0; 
		int smallest = 10000;
		String Addsmallest = "";
		for(int x = 0; x < unsortedSequences.size();x++) {
		for(int i = 0; i < unsortedSequences.size();i++) {
			if(unsortedSequences.get(i).length() < smallest && unsortedSequences.get(i).length() > previousSmallest) {
				smallest = unsortedSequences.get(i).length();
				Addsmallest = unsortedSequences.get(i);
			}
		}
		returnable.add(Addsmallest);
		previousSmallest = smallest;
		smallest = 10000;
		}
		return returnable;
	}

	public static List<String> sortWords(List<String> words) {
//		System.out.println(words.get(i).compareTo(toReturn.get(i)));
		List<String> toReturn = new ArrayList<String>();

		for(int i = 0; i < words.size(); i++){
			for(int x = 0; i < words.size(); i++){
			if(toReturn.size() < i + 1){
				toReturn.add(words.get(i));
			}else if(words.get(x).compareTo(toReturn.get(i)) < 0){
				toReturn.get(i).equals(words.get(x));
			}
		}
		}
		return toReturn;
		
	}

	
	//Add other methods here
}