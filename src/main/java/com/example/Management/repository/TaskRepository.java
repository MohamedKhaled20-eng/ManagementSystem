
package com.example.Management.repository;

import com.example.Management.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

@Repository
public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {
    List<Task> findByTitleContainingIgnoreCase(String title);
    List<Task> findByDescriptionContainingIgnoreCase(String description);
    List<Task> findByStatus(String status);
    List<Task> findByDueDate(String dueDate);
}
