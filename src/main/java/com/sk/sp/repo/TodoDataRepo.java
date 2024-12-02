package com.sk.sp.repo;

import com.sk.sp.entites.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoDataRepo extends JpaRepository<Todo, Long> {
}
