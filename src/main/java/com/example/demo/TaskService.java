package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TaskService {

	private static List<Task> tasks = new ArrayList<Task>();
	
	static {
		tasks.add(new Task(1,"Etude de cas",true, new Date()));
		tasks.add(new Task(2,"Analyse",true, new Date()));
		tasks.add(new Task(3,"Développement",false, new Date()));
		tasks.add(new Task(4,"Tests",true, new Date()));
		tasks.add(new Task(5,"Packaging",true, new Date()));
	}
	
	public List<Task> findAll() {
		return tasks;
	}
	
	public Task deleteById(int taskid) {
		Task task = findById(taskid);
		if(task != null)
			tasks.remove(task);
		return task;
	}
	
	public Task findById(int taskid) {
		for(Task task:tasks) {
			if(task.getIdentifiant() == taskid) {
				return task;
			}
		}
		return null;
	}
	
	

}
