package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class TaskResource {

	@Autowired
	private TaskService taskService;
	
	@GetMapping(path="/users/{username}/tasks")
	public List<Task> retrieveAllUserTasks(@PathVariable String username) {
		return taskService.findAll();
	}
	
	@DeleteMapping(path="/users/{username}/tasks/{taskid}")
	public ResponseEntity<Void> deleteUserTask(@PathVariable String username, @PathVariable int taskid) {
		Task task = taskService.deleteById(taskid);
		if(task != null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
}
