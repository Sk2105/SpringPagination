package com.sk.sp.repo;

import com.sk.sp.models.TodoDTO;
import com.sk.sp.entites.Todo;

import java.util.List;

public interface TodoServiceRepo {

    Todo save(TodoDTO todo);

    List<Todo> getAll(int page, int pageSize);

    Todo get(Long id);

    Todo update(Long id, TodoDTO todo);

    void delete(Long id);
}
