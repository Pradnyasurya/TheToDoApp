package com.surya.thetodoapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>(); 
	
	static {
		todos.add(new Todo(0, "Surya", "Learn SpringBoot", 
				LocalDate.now().plusYears(1), false));
		todos.add(new Todo(1, "Surya", "Get in better shape", 
				LocalDate.now().plusYears(2), false));
		todos.add(new Todo(2, "Surya", "Save money", 
				LocalDate.now().plusYears(1), false));
	}
	
	public List<Todo> findByUsername(String username){
		
		return todos;
		
	}
}
