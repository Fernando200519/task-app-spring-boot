package com.fernando.task.domain;

import java.time.LocalDate;

import com.fernando.task.domain.entity.TaskPriority;
import com.fernando.task.domain.entity.TaskStatus;

public record UpdateTaskRequest(
  String title,
  String description,
  LocalDate dueDate,
  TaskStatus status,
  TaskPriority priority
) {

}