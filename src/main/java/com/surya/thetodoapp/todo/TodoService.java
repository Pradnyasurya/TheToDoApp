package com.surya.thetodoapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>(); 
	
	private static int todosCount = 0;
	
	static {
		todos.add(new Todo(++todosCount, "Surya", "Learn SpringBoot from Udemy 1",
				LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "Surya", "Get in better shape 1",
				LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "Surya", "Save money now! 1",
				LocalDate.now().plusYears(1), false));
	}
	
	public List<Todo> findByUsername(String username){
		Predicate<? super Todo> predicate = todo -> Objects.equals(todo.getUsername(), username);
		return todos.stream().filter(predicate).toList();
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, username, description, targetDate, done);
		todos.add(todo);
	}

	public void deleteTodoById(int id){
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        return todos.stream().filter(predicate).findFirst().get();
	}

	public void updateTodo(@Valid Todo todo) {

		deleteTodoById(todo.getId());
		todos.add(todo);
	}
}
