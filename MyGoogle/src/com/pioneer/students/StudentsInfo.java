package com.pioneer.students;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StudentsInfo {

	private HashMap<String, List<String>> studentsInfo;

	public StudentsInfo() {
		addList();
	}

	public HashMap<String, List<String>> addList() {

		studentsInfo = new HashMap<>();
		studentsInfo.put("Pujan", Arrays.asList("Pujan", "Ban", "Nepal", "Texas Tech University"));
		studentsInfo.put("Najar", Arrays.asList("Najar", "Aryal",  "Lamar University, Beaumont, TX"));
		studentsInfo.put("Nirajan",Arrays.asList("Nirajan", "Lamar University", "M.S. in Computer Science"));
		return studentsInfo;
	}
}
