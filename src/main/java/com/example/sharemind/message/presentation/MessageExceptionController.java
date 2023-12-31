package com.example.sharemind.message.presentation;

import com.example.sharemind.message.exception.MaxMessageExceededException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class MessageExceptionController {
    @ExceptionHandler(MaxMessageExceededException.class)
    public ResponseEntity<String> catchMaxMessageExceededException(MaxMessageExceededException e) {
        log.error(e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
}
