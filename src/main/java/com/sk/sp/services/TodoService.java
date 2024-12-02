package com.sk.sp.services;

import com.sk.sp.entites.Todo;
import com.sk.sp.models.TodoDTO;
import com.sk.sp.repo.TodoDataRepo;
import com.sk.sp.repo.TodoServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService implements TodoServiceRepo {


    @Autowired
    private TodoDataRepo todoDataRepo;
    @Override
    public Todo save(TodoDTO todo) {
        Todo t = toTodo(todo);
        return todoDataRepo.save(t);
    }

    private Todo toTodo(TodoDTO todo) {
        Todo t = new Todo();
        t.setTitle(todo.title());
        t.setCompleted(todo.completed());
        return t;
    }

    @Override
    public List<Todo> getAll(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        return todoDataRepo.findAll(pageable).getContent();
    }

    @Override
    public Todo get(Long id) {
        return todoDataRepo.findById(id).get();
    }

    @Override
    public Todo update(Long id,TodoDTO todo) {
        Todo t = get(id);
        t.setTitle(todo.title());
        t.setCompleted(todo.completed());
        return todoDataRepo.save(t);
    }

    @Override
    public void delete(Long id) {
        todoDataRepo.deleteById(id);
    }


}
