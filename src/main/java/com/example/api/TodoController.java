package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Todo;
import com.example.service.TodoService;

@RestController
@RequestMapping("api/todos")
public class TodoController {
	@Autowired
	TodoService todoService;

	@RequestMapping(method = RequestMethod.GET)
	List<Todo> getTodos() {
		return todoService.findAll();
	}

	@RequestMapping(value = "{id}",method = RequestMethod.GET)
	Todo getTodo(@PathVariable Integer id) {
		return todoService.findOne(id);
	}
}
