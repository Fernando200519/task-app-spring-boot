package com.fernando.task.controller;

import java.util.UUID;

import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fernando.task.domain.dto.ErrorResponseDto;
import com.fernando.task.exception.TaskNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<ErrorResponseDto> handleValidationExceptions(MethodArgumentNotValidException ex) {

    String errorMessage = ex.getBindingResult().getFieldErrors().stream()
      .findFirst()
      .map(DefaultMessageSourceResolvable::getDefaultMessage)
      .orElse("Validation Failed.");

    ErrorResponseDto errorDto = new ErrorResponseDto(errorMessage);
    return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(TaskNotFoundException.class)
  public ResponseEntity<ErrorResponseDto> handleTaskNotFoundException(TaskNotFoundException ex) {
    UUID taskNotFoundId = ex.getId();
    String errorMessage = String.format("Task with ID '%s' not found.", taskNotFoundId);
    ErrorResponseDto errorDto = new ErrorResponseDto(errorMessage);
    return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
  }
}












