package com.sk.sp.controller;


import com.sk.sp.entites.Todo;
import com.sk.sp.models.TodoDTO;
import com.sk.sp.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getTodos(@RequestParam(name = "page", required = false, defaultValue = "0") int page,
                               @RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize
    ) {
        return todoService.getAll(page, pageSize);
    }


    @PostMapping
    public Todo addTodo(@RequestBody TodoDTO todo) {
        return todoService.save(todo);
    }


    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable Long id, @RequestBody TodoDTO todo) {
        return todoService.update(id, todo);
    }


    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.delete(id);
    }

    @GetMapping("/{id}")
    public Todo getTodo(@PathVariable Long id) {
        return todoService.get(id);
    }


}
