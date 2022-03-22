package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	/**
	 * Implement the method below, then right click on
	 * SolutionTests.java within src/test/java/ -> com.revature to test your code
	 * before committing and pushing to your repository.
	 */
	
	public static int[] solution(int[] data, int n) {
		
		// create a new ArrayList object 
		List<Integer> a = new ArrayList<>(); 
		
		if (n < 1) {
			return new int[0]; 
			
		} else if (data.length < 1)  {

			return data; 
		}
				
		for (int i = a.size() - 1; i > -1; i--) {
			
			ArrayList<Integer> t = new ArrayList<>(); 
			
			for (int j = 0; j < a.size(); j++) {
				
				if(a.get(j) == a.get(i)) {
					t.add(j); 
				}
				
			}
			
			if(t.size() > n){
	            for(int j = t.size()-1; j > -1; j--){
	                a.remove((int) t.get(j));
	            }

	            i -= t.size()-1;
	        }
	    }

	    data = new int[a.size()];
	    int c = 0;
	    
	    for(int d : a){
	        data[c] = d;
	        c++;
	    }

	    return data;
	}
	
}



