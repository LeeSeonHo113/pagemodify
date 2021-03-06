package spring.project.nyangmeong.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import spring.project.nyangmeong.handler.ex.CustomApiException;
import spring.project.nyangmeong.handler.ex.CustomException;
import spring.project.nyangmeong.util.Script;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomApiException.class)
    public ResponseEntity<?> apiException(Exception e) { // fetch 요청시 발동
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CustomException.class)
    public String htmlException(Exception e) { // 일반적인 요청 Get(a태그), Post(form태그) 요청
        return Script.back(e.getMessage());
    }
}