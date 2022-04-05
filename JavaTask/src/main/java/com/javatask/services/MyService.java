package com.javatask.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

import com.javatask.model.Entity;

@Service
public class MyService {

	public int[] getRandomNumbers(Entity entity) {
		
		int[] intArray = new int[entity.getNumber()];
		
		List<Integer> list = new ArrayList<>();
		
		Random random = new Random();
		
		for (int i=0; i < entity.getNumber() ; i++) {
			Integer randomWithNextInt = random.nextInt();
			list.add(randomWithNextInt);
		}
		
		if(entity.getOrder().equalsIgnoreCase("ASC")) {
			Collections.sort(list);
		}
		if(entity.getOrder().equalsIgnoreCase("DESC")) {
			Collections.sort(list,Collections.reverseOrder());
		}
		
		intArray = list.stream().mapToInt(i->i).toArray();
		return intArray;
	}

	
	
}
