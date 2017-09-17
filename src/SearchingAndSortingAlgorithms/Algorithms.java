package SearchingAndSortingAlgorithms;

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
		
		return 0;
	}
	
	//Add other methods here
}