package com.mahabir.todo;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	
//	set the login service
	@Autowired
	TodoService todoService;
	
	@RequestMapping(value="/list-todos", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		model.addAttribute("todos", todoService.retrieveTodos("in28Minutes"));
		return "list-todos";
	}
//	Initialize the Todo object (GET method)
	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showTodoPage(ModelMap model) {
		model.addAttribute("todo", new Todo(0,"in28minutes","",new Date() ,false));
		return "todo";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addTodo(ModelMap model, @Valid Todo todo, BindingResult bindingResult) {
//		todoService.addTodo((String) model.get("name"), desc, new Date(), false);
		if(bindingResult.hasErrors()) {
			return "todo";
		}
		todoService.addTodo("in28Minutes", todo.getDesc(), todo.getTargetDate(), false);
		model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/list-todos";
	}
	
	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String deleteTodo(ModelMap model,@RequestParam int id) {
//		todoService.addTodo((String) model.get("name"), desc, new Date(), false);
		todoService.deleteTodo(id);
		model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/list-todos";
	}
	

}
