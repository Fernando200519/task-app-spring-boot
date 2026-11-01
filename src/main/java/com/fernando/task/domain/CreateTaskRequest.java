package com.fernando.task.domain;

import java.time.LocalDate;

import com.fernando.task.domain.entity.TaskPriority;

public record CreateTaskRequest(
  String title,
  String description,
  LocalDate dueDate,
  TaskPriority priority
) {

}
