package com.seleco.model;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.seleco.entity.TeamName;

public class TeamNameModel {
	List<TeamName> recivedList = new LinkedList<>();
	List<TeamName> sortingList = new LinkedList<TeamName>();
	List<String> finalList=new LinkedList<>();

	public List<String> teamLogic(String[] list) {

		for (int i = 0; i < list.length; i++) {
			recivedList.add(new TeamName(list[i]));
		}
		
		Random random = new Random();
		
	while (recivedList.size() != 0) 
		{
			int randomValue = random.nextInt(recivedList.size());
			sortingList.add(recivedList.get(randomValue));
			recivedList.remove(recivedList.get(randomValue));	
		}
	
	if (sortingList.size() % 2 == 0) {
		for (int i = 0; i < sortingList.size(); i = i + 2) {
			//System.out.println(list.get(i) + " Vs " + list.get(i + 1));
			finalList.add(sortingList.get(i).getTeamName()+" Vs "+sortingList.get(i+1).getTeamName());
		}
	}else {
		int j = 0;
		for (int i = 0; i < sortingList.size(); i = j) {
			if (j < sortingList.size() - 1) {
				j = j + 2;
				//System.out.println(list.get(i) + " Vs " + list.get(i + 1));
				finalList.add(sortingList.get(i).getTeamName()+" Vs "+sortingList.get(i+1).getTeamName());
			} else {
				//System.out.println(list.get(i) + " gets walk over");
				finalList.add(sortingList.get(i).getTeamName()+ " gets walk over!");
				break;
			}

		}
	}
		return finalList;
	}
}
