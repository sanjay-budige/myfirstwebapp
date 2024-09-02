package com.sanjay.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class TodoController {
	
	private TodoService todoservice;
	
	public TodoController(TodoService todoservice) {
		super();
		this.todoservice = todoservice;
	}

	@RequestMapping("list-todos")
	public String listalltodod(ModelMap model) {
		List<Todo> todos = todoservice.findbyusername("sanjay");
		model.addAttribute("todos",todos);
				
		return "listTodos";
	}
	
	@RequestMapping(value = "add-todo",method = RequestMethod.GET)
	public String shownewtodopage() {
		return "todo";
	}
	@RequestMapping(value = "add-todo",method = RequestMethod.POST)
	public String addnewtodopage() {
		return "redirect:list-todos";
	}
	 	
}

