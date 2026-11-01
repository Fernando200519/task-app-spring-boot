package com.fernando.task.mapper;

import com.fernando.task.domain.CreateTaskRequest;
import com.fernando.task.domain.UpdateTaskRequest;
import com.fernando.task.domain.dto.CreateTaskRequestDto;
import com.fernando.task.domain.dto.TaskDto;
import com.fernando.task.domain.dto.UpdateTaskRequestDto;
import com.fernando.task.domain.entity.Task;

public interface TaskMapper {

  CreateTaskRequest fromDto(CreateTaskRequestDto dto);

  UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);

  TaskDto toDto(Task task);

}