package com.sanjay.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo(1,"sanjay","learn java",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(2,"sanjay","learn python",LocalDate.now().plusYears(2),false));
		todos.add(new Todo(3,"sanjay","learn aws",LocalDate.now().plusYears(3),false));
		todos.add(new Todo(4,"sanjay","learn full stack development",LocalDate.now().plusYears(4),false));
	}
	
	public List<Todo> findbyusername(String username){
		return todos;
	}
}