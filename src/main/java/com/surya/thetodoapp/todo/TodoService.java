package com.surya.thetodoapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>(); 
	
	private static int todosCount = 0;
	
	static {
		todos.add(new Todo(++todosCount, "Surya", "Learn SpringBoot", 
				LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "Surya", "Get in better shape", 
				LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "Surya", "Save money", 
				LocalDate.now().plusYears(1), false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, username, description, targetDate, done);
		todos.add(todo);
	}
}
